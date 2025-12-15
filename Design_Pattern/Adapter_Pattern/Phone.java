package Design_Pattern.Adapter_Pattern;

/*

The Adapter Pattern lets two incompatible classes work together by creating a bridge (adapter) between them. It’s like a translator that helps two people speaking different languages understand each other.

Let’s say you have a phone that uses a USB-C port, but your charger is a Lightning cable (like Apple's). These are incompatible, but you can make them work using an adapter.

Goal:
Make the Lightning charger work with a USB-C phone using an Adapter Pattern.

*/

// Target

interface USBTypeC {
    void chargeWithUSBTypeC();
}

// Adaptee

class LightningCharger {
    void chargeWithLightning() {
        System.out.println("Charging with apple cable");
    }
}

// Adapter

class ChargerAdapter implements USBTypeC {
    private LightningCharger lightningCharger;

    public ChargerAdapter(LightningCharger lightningCharger) {
        this.lightningCharger = lightningCharger;
    }

    @Override
    public void chargeWithUSBTypeC() {
        // Translate the USB-C request into a Lightning action
        lightningCharger.chargeWithLightning();
    }
}


// Client

public class Phone {
    public static void main(String[] args) {
        // We have a Lightning charger
        LightningCharger lightningCharger = new LightningCharger();

        // We create an adapter so it fits the USB-C port
        USBTypeC usbCharger = new ChargerAdapter(lightningCharger);

        // Now we can charge the phone
        usbCharger.chargeWithUSBTypeC();
    }
}

