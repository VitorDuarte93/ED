public class Binario {

        public static int decimalParaBinario(int decimal) {
            if (decimal == 0) {
                return 0;
            }
            
            int binario = 0;
            int digito, posicao = 1;
            while (decimal > 0) {
                digito = decimal % 2;
                binario += digito * posicao;
                decimal /= 2;
                posicao *= 10;
            }
            
            return binario;
        }
    }