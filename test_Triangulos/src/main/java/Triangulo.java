public class Triangulo {

    public static int determinarTriangulo(int la, int lb, int lc){

        /*
        *Retorna:
        * -0 si no es un triangulo
        * -1 si es isosceles
        * -2 si es escaleno
        * -3 si es equivatero
        *
        * */
        /*desigualdad triangular, Si se cumple es un triangulo:
        * la+lb>lc
        * la+lc>lb
        * Lb+lc>la
        *
        * */
        /*validar si los lados son positivo y que cumpla la desigualdad triangular*/
        if((la<=0 || lb<=0 || lc<=0)||(la+lb<=lc)||
                (la+lc<=lb)||(lb+lc<=la)){
            return 0;
        }
        if (la == lb && lb == lc) {
            return 3;//equilateros

        } else if ((la==lb && la != lc) ||
                   (lb==lc && lc != la) ||
                   (la==lc && la != lb)) {
            return 1;//isosceles
        }else {return 2;}//escaleno


    }
}
