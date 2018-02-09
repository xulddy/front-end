/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependency.injection;

/**
 *
 * @author Tan
 */
public class DrawClass {
    private Shape shape;

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }
    
    public void drawShape(){
        shape.draw();;
    }
}
