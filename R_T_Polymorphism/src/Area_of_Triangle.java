public class Area_of_Triangle extends Area_of_Circle {

    @Override
    float calculateArea(float a, float b){
        float height = a, base = b, divisor = 2, area=(height*base)/2;
        return area;

    }
}
