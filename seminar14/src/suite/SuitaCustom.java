package suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.AplicaDiscountTest;
import test.PoateRezervaTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        AplicaDiscountTest.class,
        PoateRezervaTest.class
})

@Categories.IncludeCategory()

public class SuitaCustom {

}
