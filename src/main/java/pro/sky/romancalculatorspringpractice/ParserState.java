package pro.sky.romancalculatorspringpractice;

public enum ParserState {
    BEGINNING,
    IN_NUMERAL,
    OPERAND,
    BRACKET_OPENING,
    BRACKET_CLOSING,
    ERROR
}
