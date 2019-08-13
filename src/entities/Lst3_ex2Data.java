package entities;

public class Lst3_ex2Data {
    int dia;
    int mes;
    int ano;

    //Construor da classe
    public Lst3_ex2Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
        public boolean Verifica( int dia, int mes, int ano){

            boolean result = false;
            if ((ano >= 1900) && (ano <= 2010)) {
                if ((mes >= 1) && (mes <= 12)) {
                    if ((dia >= 1) && (dia <= 31)) {
                        result = true;
                    }
                }
            }
            return result;
        }
        public int Compara ( int n_dia, int n_mes, int n_ano){
        return 0;
        }
        public int Dia () {
            return dia;
        }

        public int Mes () {
            return mes;
        }

        public String Mes_extenso () {
            String mens = null;
            switch (mes) {
                case (1):
                    mens = "Janeiro";
                    break;
                case (2):
                    mens = "Fevereiro";
                    break;
                case (3):
                    mens = "Março";
                    break;
                case (4):
                    mens = "Abril";
                    break;
                case (5):
                    mens = "Maio";
                    break;
                case (6):
                    mens = "Junho";
                    break;
                case (7):
                    mens = "Julho";
                    break;
                case (8):
                    mens = "Agosto";
                    break;
                case (9):
                    mens = "Setembro";
                    break;
                case (10):
                    mens = "Outubro";
                    break;
                case (11):
                    mens = "Novembro";
                    break;
                case (12):
                    mens = "Dezembro";
            }
            return mens;
        }
        public int Ano () {
            return ano;
        }

    }
