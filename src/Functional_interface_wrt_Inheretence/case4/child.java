package Functional_interface_wrt_Inheretence.case4;

public interface child {
    public void m2();
}

// here parent is functional interfaces and child is normal interface
// parent must have only on AM
// if parent and child contains different AM then also code compiles fine as
// parent is FI and it has only one AM
// child has 2 AM but it is normal interface

