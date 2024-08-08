module com.application {
    requires javafx.controls;
    requires javafx.fxml; //Colocar qualquer lib importada

   
    opens com.application to javafx.fxml;  //Colocar todos os packages d trabalho
    exports com.application;
}
