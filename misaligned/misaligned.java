public class misaligned {
    static int printColorMap() {
        String majorColors[] = {"White", "Red", "Black", "Yellow", "Violet"};
        String minorColors[] = {"Blue", "Orange", "Green", "Brown", "Slate"};
        Map<int, String> colorPairWithIndex = new HashMap<int, String>();
        int i = 0, j = 0;
        for(i = 0; i < 5; i++) {
            for(j = 0; j < 5; j++) {
                colorPairWithIndex.put( (i +j) , majorColors[i] + " " + minorColors[i]);
                System.out.printf("%d | %s | %s\n", i * 5 + j, majorColors[i], minorColors[i]);
            }
        }
        return colorPairWithIndex;
    }
    public static void main(String[] args) { 
        Map<int, String> result = printColorMap();
	    assert(result.get(1).equals("White Blue"));
        System.out.println("All is well (maybe!)");
    }
}
