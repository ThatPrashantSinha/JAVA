package Practice.challenge18;

public class Printer {
    protected int tonerLevel;
    protected int pagesPrinted;
    protected boolean duplex;

    public Printer(int tonerLevel,boolean duplex){
        addToner(tonerLevel);
        this.duplex=duplex;
    }
    public int getPagesPrinted(){
        return pagesPrinted;
    }
    public int addToner(int tonerLevel){
        if(tonerLevel<0||tonerLevel>100){
            this.tonerLevel=-1;
            return tonerLevel;
        }
        return this.tonerLevel+=tonerLevel;
    }
    public int printPages(int pages){
        int page=pages;
        if(duplex==true){
            System.out.println("Printing in duplex mode");
            while (page>0||tonerLevel>0) {
                pagesPrinted+=1;
                tonerLevel-=2;
                page-=2;
                if(page<=0){
                    return getPagesPrinted();
                }else if (tonerLevel==0) {
                    System.out.println("printing stopped no toner left");
                    System.out.printf("pages to be printed %d %s",page,"\n");
                    return getPagesPrinted();
                }
            }
        }else if(duplex==false){
            
            while (page>0||tonerLevel>0) {
                pagesPrinted+=1;
                tonerLevel-=1;
                page-=1;
                if(page==0){
                    System.out.println("printing finished");
                    return getPagesPrinted();
                }else if (tonerLevel==0) {
                    System.out.println("printing stopped no toner left");
                    System.out.printf("pages to be printed %d %s",page,"\n");
                    return getPagesPrinted();
                }
            }

        }
        return getPagesPrinted();
        
    }
}
