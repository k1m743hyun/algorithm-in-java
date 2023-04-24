class Solution {

    public int minPartitions(String n) {

        return Collections.max(Arrays.stream(n.split("")).map(Integer::parseInt).collect(Collectors.toList()));
    }
}