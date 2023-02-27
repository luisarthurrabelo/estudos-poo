package app.ex2;

public class Triangle {

    float lado1;
    float lado2; 
    float lado3;
    int ct;

    void setLados(float l1, float l2, float l3){
             
        lado1 = l1;
        lado2 = l2;
        lado3 = l3;
    }

    String getLados(){

        String r = "";
        r += lado1 + " ";
        r += lado2 + " ";
        r += lado3 + " ";
        return r;
    }

    float perimetroTriangulo(float l1, float l2, float l3){

        return (l1 + l2 + l3);
    }

    float tipoTriangulo(float l1, float l2, float l3){

        if(l1 == l2 && l2 == l3){
            return 1; //Equilatero
        }
        else if(l1 == l2 || l2 == l3 || l1 == l3){
            return 2; //Isósceles
        }
        else{
            return 3; //Escaleno
        }
    }
}
