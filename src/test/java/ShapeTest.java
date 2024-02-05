import org.example.ShapeFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class ShapeTest{
    @Test
    void ShapeByNumberTest(){
        ShapeFactory shape1 = new ShapeFactory(18);
        Assertions.assertEquals(Color.gray,shape1.paint);
        ShapeFactory shape2 = new ShapeFactory(77);
        Assertions.assertEquals(GradientPaint.class, shape2.paint.getClass());
    }
}