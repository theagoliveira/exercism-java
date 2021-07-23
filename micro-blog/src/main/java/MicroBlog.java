class MicroBlog {
    public String truncate(String input) {
        int[] cps = input.codePoints().limit(5).toArray();
        return new String(cps, 0, cps.length);
    }
}
