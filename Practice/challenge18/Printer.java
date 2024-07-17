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
    public int addToner(){
        this.tonerLevel=100;
        return tonerLevel;
    }
    public int addToner(int tonerLevel){
        this.tonerLevel=tonerLevel<0?-1:tonerLevel>100?-1:tonerLevel;
        return tonerLevel;
    }
    public int printPages(int pages){
        int page=pages;
        if(duplex==true){
            System.out.println("its a Duplex print!");
            while (page>0||tonerLevel>0) {
                pagesPrinted+=1;
                tonerLevel-=2;
                page-=2;
                if(page<=0){
                    System.out.println("printing finished");
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
