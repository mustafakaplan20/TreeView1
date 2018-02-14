package com.company;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;
    Scene scene;
    TreeView<String> tree;



    public static void main(String[] args) {

        launch(args);
	// write your code here
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window=primaryStage;
        window.setTitle("Kaplan2064 TreeView");

        TreeItem<String> root,treewiev,megan;

        //Root
        root=new TreeItem<>();
        root.setExpanded(true);

        //TreeView
        treewiev=makeBranch("TreeView",root);
        makeBranch("haci",treewiev);
        makeBranch("kürt",treewiev);
        makeBranch("helasddf",treewiev);
        makeBranch("osdjıednc",treewiev);

        //megan

        megan=makeBranch("Megan",root);
        makeBranch("boya",megan);
        makeBranch("pasta",megan);
        makeBranch("cila",megan);
        makeBranch("sbfsuyrvbkf",megan);

        //create tree
        tree=new TreeView<>(root);
        tree.setShowRoot(false);
        tree.getSelectionModel().selectedItemProperty().addListener((v,oldValue,newValue)->{
            if(newValue!=null) System.out.println(newValue.getValue());
        });



        //Layout
        StackPane layout=new StackPane();
        layout.getChildren().add(tree);
        scene=new Scene(layout,300,300);
        window.setScene(scene);
        window.show();


    }
    //dalları yap
    public TreeItem<String> makeBranch(String title,TreeItem<String> parent){
        TreeItem<String> item=new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);//brach build
        return item;
    }


}
