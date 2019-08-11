import io.infinite.bobbin.Bobbin;
import io.infinite.bobbin.BobbinFactory;

class BobbinTest {

    static Bobbin bobbin = (Bobbin) new BobbinFactory().getLogger(BobbinTest.class.getCanonicalName());

    public static void main(String[] args) {
        bobbin.debug("Hello world");
    }

}