package view;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import complex.ComplexNumber;

public class View {
    
    Scanner in = new Scanner(System.in);
    String[] operators = new String[]{"+", "-", "*", "/"};

    public double getValue(String title) {
        double inputValue;
        while (true) {
            try {
                System.out.print(title);
                inputValue = in.nextDouble();
                return inputValue;
            } catch (InputMismatchException e) {
                System.out.println("Необходимо ввести десятичное число!");
                in.next();
            }
        }
    }

    public String getOperator(String title) {
        String inputValue;
        in.nextLine();
        while (true) {
            System.out.print(title);
            inputValue = in.nextLine();
            if (Arrays.asList(operators).contains(inputValue)) {
                return inputValue;
            }
            System.out.println("Необходимо ввести один из операторов: " + String.join(", ", operators));
        }
    }

    public String print(ComplexNumber x, ComplexNumber y, String operator, ComplexNumber result) {
        DecimalFormat df = new DecimalFormat("0.##########");
        String resultText = String.format("Результат: (%s + %si) %s (%s + %si) = %s + %si",
            df.format(x.getRealPart()), df.format(x.getImaginaryPart()),
            operator,
            df.format(y.getRealPart()), df.format(y.getImaginaryPart()),
            df.format(result.getRealPart()), df.format(result.getImaginaryPart()));
        System.out.printf(resultText);
        return resultText;
    }
}
