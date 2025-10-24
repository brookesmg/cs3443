module edu.utsa.cs3443.githubdemo002 {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.utsa.cs3443.githubdemo002 to javafx.fxml;
    exports edu.utsa.cs3443.githubdemo002;
}