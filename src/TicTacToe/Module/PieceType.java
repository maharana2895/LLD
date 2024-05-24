package TicTacToe.Module;


public enum PieceType {
	X("X"),
	O("O");
	private String value;
	PieceType(String val) {
		this.value=val;
	}
	public String getValue() {
		return this.value;
	}
//	private final String textRepresentation;
//
//    private GeneralInformation(String textRepresentation) {
//        this.textRepresentation = textRepresentation;
//    }
//
//    @Override public String toString() {
//         return textRepresentation;
//    }
	
}
