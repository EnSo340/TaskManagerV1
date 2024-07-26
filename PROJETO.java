
    import java.util.Scanner;
    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class PROJETO {
    
    
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
    
    
            System.out.println("Escreva seu nome: ");
            String nome = teclado.nextLine();
    
    
            System.out.println("Olá " + nome + " qual tarefa deseja realizar hoje? ");
            System.out.println("[1] Calculadora ");
            System.out.println("[2] Medidor de temperatura ");
            System.out.println("[3] Calculador de média ");
            System.out.println("[4] Contador de semanas");
            int op = teclado.nextInt();
    
            switch (op) {
                case 1:
                    System.out.println("Digite um numero: ");
                    int n1 = teclado.nextInt();
                    System.out.println("Digite o segundo numero: ");
                    int n2 = teclado.nextInt();
    
                    calculadora(n1, n2);
    
                    break;
                case 2:
                    System.out.println("Qual a temperatura desejada? ");
                    int temp = teclado.nextInt();
    
                    System.out.println("1 Graus Celsius");
                    System.out.println("2 Graus Fahrenheit");
                    int r = teclado.nextInt();
    
                    if (r == 1)
                        System.out.println("Sua temperatura de Fahrenheit para Celsius é " + temp * 1.8 + 32);
    
    
                    else if (r == 2)
                        System.out.println("Sua temperatura de Celsius para Fahrenheit é " + (temp - 32) * 5 / 9);
    
                    else
                        System.out.println("Opção invalida!");
                    break;
                case 3:
                    System.out.println("Você está no ensino superior ou medio?");
                    System.out.println("[1] Superior");
                    System.out.println("[2] Médio");
                    int respMedia = teclado.nextInt();
    
                    System.out.println("Digite sua primeira nota");
                    int not1 = teclado.nextInt();
                    System.out.println("Digite sua segunda nota");
                    int not2 = teclado.nextInt();
                    System.out.println("Digite sua terceira nota");
                    int not3 = teclado.nextInt();
                    System.out.println("Digite sua quarta nota");
                    int not4 = teclado.nextInt();
    
                    calcMedia(not1, not2, not3, not4, respMedia);
                    break;
            }
        }
    
        static void calculadora(int n1, int n2) {
            Scanner teclado = new Scanner(System.in);
    
            System.out.println("Qual a operação desejada? ");
            System.out.println("1) Soma ");
            System.out.println("2) Subtração ");
            System.out.println("3) Divisão");
            System.out.println("4) Multiplicação");
            int o = teclado.nextInt();
    
    
            switch (o) {
                case 1:
                    System.out.println("O seu resultado é" + n1 + n2);
                    break;
                case 2:
                    System.out.println("O seu resultado é" + (n1 - n2));
                    break;
                case 3:
                    System.out.println("O seu resultado é " + n1 / n2);
                    break;
                case 4:
                    System.out.println("O seu resultado é " + n1 * n2);
                    break;
                default:
                    System.out.println("Opção invalida! ");
                    break;
    
            }
    
        }
    
        static void calcMedia(int not1, int not2, int not3, int not4, int respMedia) {
    
            int media;
    
            media = (not1 + not2 + not3 + not4 / 4);
    
            if (media >= 6 && respMedia == 1) {
    
                System.out.println("Você está aprovado com " + media + " de média");
    
            } else if (media <= 5 && respMedia == 1) {
                System.out.println("Você está de recuperação" + media + " de média");
    
            } else if (media >= 5 && respMedia == 2) {
    
                System.out.println("Você está aprovado com " + media + " de média");
    
            } else if (media < 5 && respMedia == 2) {
                System.out.println("Você está de recuperação" + media + " de média");
            } else {
                System.out.println("Opção invalida!");
            }
    
        }
    }
    

