package pattern.factory_method.cutprint;

public abstract class CutPrint {

    abstract void draw();
    abstract void cut();
    abstract void print();
    abstract Cuttable createCuttable();
    abstract CutPrint createCutPrint();
    
}
