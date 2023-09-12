package dmit2015.faces;

import dmit2015.model.Circle;
import org.omnifaces.util.Messages;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import jakarta.annotation.PostConstruct;

import java.io.Serializable;

@Named("currentCircleViewScopedView")
@ViewScoped // create this object for one HTTP request and keep in memory if the next is for the same page
// class must implement Serializable
public class CircleViewScopedView implements Serializable {

    // Declare read/write properties (field + getter + setter) for each form
    private Circle currentCircle = new Circle();
    // Declare read only properties (field + getter) for data sources

    // Declare private fields for internal usage only objects

    @PostConstruct // This method is executed after DI is completed (fields with @Inject now have values)
    public void init() { // Use this method to initialized fields instead of a constructor
        // Code to access fields annotated with @Inject

    }

    public void onClear() {
        // Set all fields to default values
    }
}