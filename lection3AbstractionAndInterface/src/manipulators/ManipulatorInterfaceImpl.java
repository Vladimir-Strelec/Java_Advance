package manipulators;

import java.util.LinkedHashMap;

public class ManipulatorInterfaceImpl implements ManipulatorInterface{
    @Override
    public String toLowerCase(String line) {
        return line.toLowerCase();
    }

    @Override
    public String toUpperCase(String line) {
        return line.toUpperCase();
    }

    @Override
    public String toUpperCaseFirstChr(String line) {
        String lineLower = this.toLowerCase(line);
        String firstChr = lineLower.substring(0, 1);
        return firstChr.toUpperCase() + lineLower.substring(1);
    }

    @Override
    public String toSplitWithSpace(String line) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            stringBuilder.append(line.charAt(i));
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    @Override
    public String getIndexAndChr(String line) {
        LinkedHashMap<Integer, Character> lineMap = new LinkedHashMap<>();
        for (int i = 0; i < line.length(); i++) {
            lineMap.put(i, line.charAt(i));
        }
        return lineMap.toString().substring(1, lineMap.toString().length()-1);
    }

}
