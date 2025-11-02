package zadanie7;

public class Main {
    static void main(String[] args) {
        /*
        zmienne typów prostych (pierwotnych)
        ∙ numeryczne:
            ∙ całkowite (byte, short, int, long)
            ∙ rzeczywiste (float, double)
            ∙ znakowe (char)
        ∙ orzecznikowe (boolean)
        */
        
        
        // numeryczne całkowite
        
        // byte, 8b/1B
        // wartość min -2^7, wartość max 2^7-1
        // liczba możliwych wartości 2^8
        byte minByteVal = -128;
        byte maxByteVal = 127;
        
        // short, 16b/2B
        // wartość min -2^15, wartość max 2^15-1
        // liczba możliwych wartości 2^16
        short minShortVal = -32_768;
        short maxShortVal = 32_767;
        
        // int, 32b/4B
        // wartość min -2^31, wartość max 2^31-1
        // liczba możliwych wartości 2^32
        int minIntVal = -2_147_483_648;
        int maxIntVal = 2_147_483_647;
        
        // int, 32b/4B
        // wartość min -2^63, wartość max 2^63-1
        // liczba możliwych wartości 2^64
        long minLongVal = -9_223_372_036_854_775_808L;
        long maxLongVal = 9_223_372_036_854_775_807L;
        
        
        // numeryczne znakowe
        
        // char, 16b/2B
        // wartość min 0 lub '\u0000', wartość max 65_535 (2^16) lub '\uFFFF'
        // liczba możliwych wartości 2^16
        char minCharVal = '\u0000';
        char maxCharVal = '\uFFFF';
        
        
        // numeryczne rzeczywiste
        
        // float, 32b/4B
        // min dodatnia/ujemna wartość ~1,4 * 10^-45, max dodatnia/ujemna wartość ~3.4 * 10^38
        // precyzja do 7 cyfr dziesiętnych
        // liczba możliwych kombinacji bitów 2^32
        float minFloatVal = 1.4e-45f;
        float maxFloatVal = 3.4028235e38f;
        
        // double, 64b/8B
        // min dodatnia/ujemna wartość ~4,9 * 10^-324, max dodatnia/ujemna wartość ~1.8 * 10^308
        // precyzja do 15-16 cyfr dzisiętnych
        // liczba możliwych kombinacji bitów 2^64
        double minDoubleVal = 4.9e-324;
        double maxDoubleVal = 1.7976931348623157e308;
        
        
        // orzecznikowe
        
        // boolean, 1b logicznie, nie ma wartości min i max
        // dwie kombinacje: true i false
        boolean valTrue = true;
        boolean valFalse = false;
    }
}
