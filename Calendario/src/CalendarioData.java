import java.util.Scanner;

public class CalendarioData {
    private int dia;
    private int mes;
    private int ano;

    public CalendarioData(int dia, int mes, int ano) {
        if (validarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Data inválida.");
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setDia(int dia) {
        if (validarData(dia, this.mes, this.ano)) {
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("Dia inválido para o mês/ano atual.");
        }
    }

    public void setMes(int mes) {
        if (validarData(this.dia, mes, this.ano)) {
            this.mes = mes;
        } else {
            throw new IllegalArgumentException("Mês inválido para o dia/ano atual.");
        }
    }

    public void setAno(int ano) {
        if (validarData(this.dia, this.mes, ano)) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Ano inválido.");
        }
    }

    public void setData(int dia, int mes, int ano) {
        if (validarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Data inválida.");
        }
    }

    private boolean validarData(int dia, int mes, int ano) {
        if (ano < 1900) {
            return false;
        }

        if (mes < 1 || mes > 12) {
            return false;
        }

        if (dia < 1 || dia > diasNoMes(mes, ano)) {
            return false;
        }

        return true;
    }

    private int diasNoMes(int mes, int ano) {
        if (mes == 2) {
            if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
                return 29; // Lógica para verificar se ano bissexto
            } else {
                return 28;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30; // Lógica para mês 30 dias
        } else {
            return 31; 
        }
    }

    public String formatarData() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. Instanciando uma data com base em valores predefinidos para dia, mês e ano.
        CalendarioData dataPredefinida = new CalendarioData(17, 8, 2023);

        System.out.println("Data predefinida: " + dataPredefinida.formatarData());

        // b. Solicitando ao usuário que insira novos valores para dia, mês e ano
        System.out.println("Digite o novo dia: ");
        int novoDia = scanner.nextInt();

        System.out.println("Digite o novo mês: ");
        int novoMes = scanner.nextInt();

        System.out.println("Digite o novo ano: ");
        int novoAno = scanner.nextInt();

       
        dataPredefinida.setData(novoDia, novoMes, novoAno);

        // Imprimindo a nova data no formato "dd/mm/aaaa após modificação"
        System.out.println("Data modificada: " + dataPredefinida.formatarData());

        scanner.close();
    }
}
