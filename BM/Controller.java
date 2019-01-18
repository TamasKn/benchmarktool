package BM;

import javafx.event.EventHandler;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.text.DecimalFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    @FXML TextField gpuField;
    @FXML TextField cpuField;
    @FXML Label resultField;
    @FXML Label warningLabel;

    //Gpu table attributes, has to match with id in fxml
    @FXML TableView<GPUs> gpuSTableView;
    @FXML TableColumn<GPUs, String> gpuName;
    @FXML TableColumn<GPUs, Integer> gpuPoint;

    @FXML TableView<GPUd> gpuDTableView;
    @FXML TableColumn<GPUd, String> gpuDName;
    @FXML TableColumn<GPUd, String> gpuDPoint;

    @FXML TableView<CPU> cpuTableView;
    @FXML TableColumn<CPU, String> cpuName;
    @FXML TableColumn<CPU, String> cpuPoint;

    private double x, y;






    DecimalFormat format = new DecimalFormat( "#.0" );


    @Override
    public void initialize(URL location, ResourceBundle resources){ //Trigger at start

        //Runs the checker method to avoid letters in the integer field
        checker();

        //Populate data into the table view, property has to match with model variables
        gpuName.setCellValueFactory(new PropertyValueFactory<GPUs, String>("gpuName"));
        gpuPoint.setCellValueFactory(new PropertyValueFactory<GPUs, Integer>("gpuPoint"));

        gpuDName.setCellValueFactory(new PropertyValueFactory<GPUd, String>("gpuDName"));
        gpuDPoint.setCellValueFactory(new PropertyValueFactory<GPUd, String>("gpuDPoint"));

        cpuName.setCellValueFactory(new PropertyValueFactory<CPU, String>("cpuName"));
        cpuPoint.setCellValueFactory(new PropertyValueFactory<CPU, String>("cpuPoint"));

        //Pulling data from array list
        gpuSTableView.getItems().setAll(new GPUs().gpuSingleList());
        gpuDTableView.getItems().setAll(new GPUd().gpuDualList());
        cpuTableView.getItems().setAll(new CPU().cpuList());

    }

    @FXML
    void dragged(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setX(event.getScreenX() - x);
        stage.setY(event.getScreenY() - y);
    }

    @FXML
    void pressed(MouseEvent event) {
        x = event.getSceneX();
        y = event.getSceneY();
    }


    @FXML
    void minimize(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setIconified(true);
    }

    @FXML
    void close(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }


    //Do not touch below methods

    public void checker(){
        gpuField.setTextFormatter( new TextFormatter<>(c ->
        {
            if ( c.getControlNewText().isEmpty() )
            {
                return c;
            }

            ParsePosition parsePosition = new ParsePosition( 0 );
            Object object = format.parse( c.getControlNewText(), parsePosition );

            if ( object == null || parsePosition.getIndex() < c.getControlNewText().length() )
            {
                return null;
            }
            else
            {
                return c;
            }
        }));

        cpuField.setTextFormatter( new TextFormatter<>(c ->
        {
            if ( c.getControlNewText().isEmpty() )
            {
                return c;
            }

            ParsePosition parsePosition = new ParsePosition( 0 );
            Object object = format.parse( c.getControlNewText(), parsePosition );

            if ( object == null || parsePosition.getIndex() < c.getControlNewText().length() )
            {
                return null;
            }
            else
            {
                return c;
            }
        }));
    }

    @FXML
    public void calculateButtonClicked() throws Exception{


        int gpuSc = Integer.parseInt(gpuField.getText());
        int cpuSc = Integer.parseInt(cpuField.getText());
        int res = 0;
        try{
            res = benchmarkResult(gpuSc, cpuSc);
        } catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }

        String resText = Integer.toString(res);

        try{
            resultField.setText(resText);
        }catch(RuntimeException e){
            warningLabel.setText("Only number allowed");
            System.out.println(e.getMessage());
        }


    }

    private int benchmarkResult(int gpu, int cpu){
        double result = 1/(0.85/gpu + 0.15/cpu);
        return (int) result;
    }

    public void getGpuPoint(){
        GPUs point = gpuSTableView.getSelectionModel().getSelectedItem();
        gpuField.setText(String.valueOf(point.getGpuPoint()));
    }

    public void gpuKeyPressed(KeyEvent k){
        GPUs point = gpuSTableView.getSelectionModel().getSelectedItem();
        if(k.getCode() == KeyCode.ENTER){
            gpuField.setText(String.valueOf(point.getGpuPoint()));
        }

    }

    public void getGpuDPOint(){
        GPUd point = gpuDTableView.getSelectionModel().getSelectedItem();
        gpuField.setText(String.valueOf(point.getGpuDPoint()));
    }

    public void gpuDKeyPressed(KeyEvent k){
        GPUd point = gpuDTableView.getSelectionModel().getSelectedItem();
        if(k.getCode() == KeyCode.ENTER){
            gpuField.setText(String.valueOf(point.getGpuDPoint()));
        }

    }

    public void getCpuPoint(){
        CPU point = cpuTableView.getSelectionModel().getSelectedItem();
        cpuField.setText(String.valueOf(point.getCpuPoint()));
    }

    public void cpuKeyPressed(KeyEvent k){
        CPU point = cpuTableView.getSelectionModel().getSelectedItem();
        if(k.getCode() == KeyCode.ENTER){
            cpuField.setText(String.valueOf(point.getCpuPoint()));
        }

    }


}
