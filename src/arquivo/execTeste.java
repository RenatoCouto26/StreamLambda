package arquivo;

public class execTeste {

	public static void main(String[] args) {
		
		String[] arrey = new String[6];		
		
			try {
				if (arrey.length != 7) throw new LancaException("array incompat�vel");
				System.out.println("execu��o sem erro..");
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	}

}
