package tool.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import tool.model.Lane;
import tool.model.Side;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        MenuBar menuBar = new MenuBar();
        Menu settingsMenu = new Menu("Settings");
        menuBar.getMenus().add(settingsMenu);

        Menu menuTop = new Menu("TOP");
        Menu menuJgl = new Menu("JGL");
        Menu menuMid = new Menu("MID");
        Menu menuAdc = new Menu("ADC");
        Menu menuSupp = new Menu("SUPP");
        MenuItem itemAll = new MenuItem("ALL");

        MenuItem itemTopRed = new MenuItem("RED");
        MenuItem itemTopBlue = new MenuItem("BLUE");
        MenuItem itemJglRed = new MenuItem("RED");
        MenuItem itemJglBlue = new MenuItem("BLUE");
        MenuItem itemMidRed = new MenuItem("RED");
        MenuItem itemMidBlue = new MenuItem("BLUE");
        MenuItem itemAdcRed = new MenuItem("RED");
        MenuItem itemAdcBlue = new MenuItem("BLUE");
        MenuItem itemSuppRed = new MenuItem("RED");
        MenuItem itemSuppBlue = new MenuItem("BLUE");

        settingsMenu.getItems().addAll(menuTop, menuJgl, menuMid, menuAdc, menuSupp, itemAll);
        menuTop.getItems().addAll(itemTopBlue, itemTopRed);
        menuJgl.getItems().addAll(itemJglBlue, itemJglRed);
        menuMid.getItems().addAll(itemMidBlue, itemMidRed);
        menuAdc.getItems().addAll(itemAdcBlue, itemAdcRed);
        menuSupp.getItems().addAll(itemSuppBlue, itemSuppRed);

        itemAll.setOnAction(event -> {
            ChampSelect cs = new ChampSelect(Side.NONE, Lane.NONE);
            GridPane gp = cs.generateView();
            VBox vbox = new VBox(menuBar, gp);
            primaryStage.setScene(new Scene(vbox, 300, 400));
            primaryStage.show();
        });
        itemTopBlue.setOnAction(event -> {
            ChampSelect cs = new ChampSelect(Side.BLUE, Lane.TOP);
            GridPane gp = cs.generateView();
            VBox vbox = new VBox(menuBar, gp);
            primaryStage.setScene(new Scene(vbox, 300, 400));
            primaryStage.show();
        });
        itemTopRed.setOnAction(event -> {
            ChampSelect cs = new ChampSelect(Side.RED, Lane.TOP);
            GridPane gp = cs.generateView();
            VBox vbox = new VBox(menuBar, gp);
            primaryStage.setScene(new Scene(vbox, 300, 400));
            primaryStage.show();
        });
        itemJglBlue.setOnAction(event -> {
            ChampSelect cs = new ChampSelect(Side.BLUE, Lane.JGL);
            GridPane gp = cs.generateView();
            VBox vbox = new VBox(menuBar, gp);
            primaryStage.setScene(new Scene(vbox, 300, 400));
            primaryStage.show();
        });
        itemJglRed.setOnAction(event -> {
            ChampSelect cs = new ChampSelect(Side.RED, Lane.JGL);
            GridPane gp = cs.generateView();
            VBox vbox = new VBox(menuBar, gp);
            primaryStage.setScene(new Scene(vbox, 300, 400));
            primaryStage.show();
        });
        itemMidBlue.setOnAction(event -> {
            ChampSelect cs = new ChampSelect(Side.BLUE, Lane.MID);
            GridPane gp = cs.generateView();
            VBox vbox = new VBox(menuBar, gp);
            primaryStage.setScene(new Scene(vbox, 300, 400));
            primaryStage.show();
        });
        itemMidRed.setOnAction(event -> {
            ChampSelect cs = new ChampSelect(Side.RED, Lane.MID);
            GridPane gp = cs.generateView();
            VBox vbox = new VBox(menuBar, gp);
            primaryStage.setScene(new Scene(vbox, 300, 400));
            primaryStage.show();
        });
        itemAdcBlue.setOnAction(event -> {
            ChampSelect cs = new ChampSelect(Side.BLUE, Lane.ADC);
            GridPane gp = cs.generateView();
            VBox vbox = new VBox(menuBar, gp);
            primaryStage.setScene(new Scene(vbox, 300, 400));
            primaryStage.show();
        });
        itemAdcRed.setOnAction(event -> {
            ChampSelect cs = new ChampSelect(Side.RED, Lane.ADC);
            GridPane gp = cs.generateView();
            VBox vbox = new VBox(menuBar, gp);
            primaryStage.setScene(new Scene(vbox, 300, 400));
            primaryStage.show();
        });
        itemSuppBlue.setOnAction(event -> {
            ChampSelect cs = new ChampSelect(Side.BLUE, Lane.SUPP);
            GridPane gp = cs.generateView();
            VBox vbox = new VBox(menuBar, gp);
            primaryStage.setScene(new Scene(vbox, 300, 400));
            primaryStage.show();
        });
        itemSuppRed.setOnAction(event -> {
            ChampSelect cs = new ChampSelect(Side.RED, Lane.SUPP);
            GridPane gp = cs.generateView();
            VBox vbox = new VBox(menuBar, gp);
            primaryStage.setScene(new Scene(vbox, 300, 400));
            primaryStage.show();
        });

        VBox vbox = new VBox(menuBar, new Pane());
        primaryStage.setScene(new Scene(vbox, 300, 100));
        primaryStage.setTitle("Champ Select");
        primaryStage.show();
    }
}