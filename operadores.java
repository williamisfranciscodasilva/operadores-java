import javax.swing.JOptionPane;
class operadores
{
   public static void main(String args[])
   {
      float num1, num2, adicao, subtracao, multiplicacao,divisao;

      num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro número: "));
      num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número: "));

      adicao = num1 + num2;
      subtracao = num1 - num2;
      multiplicacao = num1 * num2;
      divisao = num1 / num2;

      System.out.println("A soma de "+num1+ " + "+num2+" = "+adicao);
      System.out.println("A subtracao de "+num1+ " - "+num2+" = "+subtracao);
      System.out.println("A multiplicacao de "+num1+ " * "+num2+" = "+multiplicacao);
      System.out.println("A divisao de "+num1+ " / "+num2+" = "+divisao);

      JOptionPane.showMessageDialog(null,"A soma de "+num1+ " + "+num2+" = "+adicao+
      "\nA subtracao de "+num1+ " - "+num2+" = "+subtracao+
      "\nA multiplicacao de "+num1+ " * "+num2+" = "+multiplicacao+
      "\nA divisao de "+num1+ " / "+num2+" = "+divisao);
   }
}