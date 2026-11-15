import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 测试设计原则：
 * 1. 使用等价类划分覆盖单元素、两个元素和多个元素；
 * 2. 使用边界值分析覆盖重复元素、整十数和最大输入值；
 * 3. 使用能够暴露原代码缺陷的多位整数测试用例。
 */
public class L2024112835_4_Test {

    /**
     * 测试目的：验证题目给出的正常示例。
     * 测试用例：输入 [3,6,9,1]，期望结果为 3。
     */
    @Test
    public void testExample() {
        assertEquals(3, new Solution4().maximumGap(
            new int[]{3, 6, 9, 1}
        ));
    }

    /**
     * 测试目的：验证只有一个元素时返回 0。
     * 测试用例：输入 [10]，期望结果为 0。
     */
    @Test
    public void testSingleElement() {
        assertEquals(0, new Solution4().maximumGap(
            new int[]{10}
        ));
    }

    /**
     * 测试目的：验证两个元素不会因原代码的长度错误而返回 0。
     * 测试用例：输入 [1,10]，期望结果为 9。
     */
    @Test
    public void testTwoElements() {
        assertEquals(9, new Solution4().maximumGap(
            new int[]{1, 10}
        ));
    }

    /**
     * 测试目的：验证原代码不会忽略数组最后一个元素。
     * 测试用例：输入 [1,2,100]，期望结果为 98。
     */
    @Test
    public void testLastElement() {
        assertEquals(98, new Solution4().maximumGap(
            new int[]{1, 2, 100}
        ));
    }

    /**
     * 测试目的：验证重复元素之间的最大差值为 0。
     * 测试用例：输入 [5,5,5]，期望结果为 0。
     */
    @Test
    public void testDuplicateElements() {
        assertEquals(0, new Solution4().maximumGap(
            new int[]{5, 5, 5}
        ));
    }

    /**
     * 测试目的：验证多位整数的基数排序是否正确。
     * 测试用例：输入 [10,5,100,20]，期望结果为 80。
     */
    @Test
    public void testMultipleDigits() {
        assertEquals(80, new Solution4().maximumGap(
            new int[]{10, 5, 100, 20}
        ));
    }

    /**
     * 测试目的：验证最大值是 10 的整数次幂时不会漏掉最高位。
     * 测试用例：输入 [1,100]，期望结果为 99。
     */
    @Test
    public void testPowerOfTen() {
        assertEquals(99, new Solution4().maximumGap(
            new int[]{1, 100}
        ));
    }

    /**
     * 测试目的：验证题目允许的最大元素值。
     * 测试用例：输入 [1,1000000000]，期望结果为 999999999。
     */
    @Test
    public void testMaximumValue() {
        assertEquals(999999999, new Solution4().maximumGap(
            new int[]{1, 1000000000}
        ));
    }
}