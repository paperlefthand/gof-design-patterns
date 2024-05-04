package pattern.factorymethod.cutprint;

import pattern.factorymethod.Product;

public abstract                                                                                      class Print extends Product {

    abstract void draw(Cuttable hanzai);
    abstract void cut(Cuttable hanzai);
    abstract void print(Cuttable hanzai);

    abstract Cuttable createCuttable();

    public void createCutPrint(){ 
        Cuttable hanzai = createCuttable();
        draw( hanzai ); 
        cut( hanzai ); 
        print( hanzai ); 
    }

    @Override
    public void use() {
        // TODO Auto-generated method stub
        
    } 
    
}
