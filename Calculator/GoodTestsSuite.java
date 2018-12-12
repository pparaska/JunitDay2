import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@IncludeCategory(GoodCategory.class)
@Suite.SuiteClasses({
	AdditionTest.class,
	SubtractionTest.class,
	MultiplicationTest.class,
	DivisionTest.class})
public class GoodTestsSuite {

}
