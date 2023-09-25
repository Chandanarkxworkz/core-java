class CellExecutor {

	public static void main(String[] time){
		Cell cell=new Cell();
		cell.setCellId(800);
		cell.setCellName("Button cell");
		cell.setVoltage(4.5);
		
		Watch1 watch=new Watch1();
		watch.cell=cell;
		watch.watchName="Sony";
		System.out.println("******************************************************************");
		System.out.println("Watch Name : "+watch.watchName);
		System.out.println("Cell id : "+watch.cell.getCellId());
		System.out.println("Cell Name : "+watch.cell.getCellName());
		System.out.println("Cell voltage : "+watch.cell.getVoltage());
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

	
}
}