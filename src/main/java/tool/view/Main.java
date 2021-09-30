package tool.view;

import javafx.application.Application;
import javafx.geometry.Pos;
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

        itemAll.setOnAction(event -> champSelectView(primaryStage, menuBar, Side.NONE, Lane.NONE));
        itemTopBlue.setOnAction(event -> champSelectView(primaryStage, menuBar, Side.BLUE, Lane.TOP));
        itemTopRed.setOnAction(event -> champSelectView(primaryStage, menuBar, Side.RED, Lane.TOP));
        itemJglBlue.setOnAction(event -> champSelectView(primaryStage, menuBar, Side.BLUE, Lane.JGL));
        itemJglRed.setOnAction(event -> champSelectView(primaryStage, menuBar, Side.RED, Lane.JGL));
        itemMidBlue.setOnAction(event -> champSelectView(primaryStage, menuBar, Side.BLUE, Lane.MID));
        itemMidRed.setOnAction(event -> champSelectView(primaryStage, menuBar, Side.RED, Lane.MID));
        itemAdcBlue.setOnAction(event -> champSelectView(primaryStage, menuBar, Side.BLUE, Lane.ADC));
        itemAdcRed.setOnAction(event -> champSelectView(primaryStage, menuBar, Side.RED, Lane.ADC));
        itemSuppBlue.setOnAction(event -> champSelectView(primaryStage, menuBar, Side.BLUE, Lane.SUPP));
        itemSuppRed.setOnAction(event -> champSelectView(primaryStage, menuBar, Side.RED, Lane.SUPP));

        VBox vbox = new VBox(menuBar, new Pane());
        primaryStage.setScene(new Scene(vbox, 300, 100));
        primaryStage.setTitle("Champ Select");
        primaryStage.show();
    }

    private void champSelectView(Stage primaryStage, MenuBar menuBar, Side side, Lane lane) {
        ChampSelect cs = new ChampSelect(side, lane);
        GridPane gp = cs.generateView();
        Button refresh = new Button("Refresh");
        VBox vbox = new VBox(new VBox(menuBar, gp), refresh);
        vbox.setAlignment(Pos.CENTER);
        primaryStage.setScene(new Scene(vbox, 300, 400));
        primaryStage.show();
        refresh.setOnAction(event -> champSelectView(primaryStage, menuBar, side, lane));
        System.out.println(side + " " + lane);
    }
}