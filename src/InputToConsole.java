public class InputToConsole implements InputInformation {
    @Override
    public void inputInformation(Order order) {
        order.setClientName(Prompt.prompt("Client name: "));
        order.setProduct(Prompt.prompt("Product: "));
        order.setQnt(Integer.parseInt(Prompt.prompt("Quantity: ")));
        order.setPrice(Integer.parseInt(Prompt.prompt("Price: ")));
    }
}