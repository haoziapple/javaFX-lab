package com.github.haozi.javafxlab.jfx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author wanghao
 * @Description
 * @date 2019-11-09 11:24
 */
public class UserInput extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //网格布局
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        //网格垂直间距
        grid.setHgap(10);
        //网格水平间距
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        //添加标题
        Text sceneTitle = new Text("Welcome");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(sceneTitle, 0, 0, 2, 1);

        //用户标签及文本框
        Label userName = new Label("用户名：");
        grid.add(userName, 0, 1);
        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);
        //密码标签及文本框
        Label pw = new Label("密码：");
        grid.add(pw, 0, 2);
        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        //添加提交按钮
        Button btn = new Button("登录");
        HBox hbtn = new HBox(10);
        hbtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbtn.getChildren().add(btn);
        grid.add(hbtn, 1, 4);

        // 提交文本提示
        final Text actionTaget = new Text();
        grid.add(actionTaget,1,6);

        btn.setOnAction(e -> {
            actionTaget.setFill(Color.FIREBRICK);
            actionTaget.setText("已经登录");
        });

        primaryStage.setTitle("Login");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
