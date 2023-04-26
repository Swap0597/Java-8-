package Functional_interface_wrt_Inheretence.case3;

//@FunctionalInterface
public interface child {
    //public void m2();
}

// here parent and child are both functional interfaces
// they must have only on AM
// if parent and child contains different AM then
// parent has only on AM that is fine
// but child has 2 AM so compilation error occur
