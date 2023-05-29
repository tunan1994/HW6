public class Program {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");

        Order order = new Order("", "", 0, 0);
        InputInformation input = new InputToConsole();
        SaveToFile saveJson = new SaveToJson();

        input.inputInformation(order);
        saveJson.save(order);
    }
}