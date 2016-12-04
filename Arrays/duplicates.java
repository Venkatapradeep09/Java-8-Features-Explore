//Java 8 Solution To find duplicates
//Source: Leetcode 
public boolean containsDuplicate(int[] nums) {
    Set<Integer> seen = new HashSet<>();
    return Arrays.stream(nums).anyMatch(num -> !seen.add(num));
}