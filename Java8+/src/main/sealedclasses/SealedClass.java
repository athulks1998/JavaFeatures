package main.sealedclasses;

/**
 * @author Athul.S
 * Defining a Sealed class by using permits keyword
 * Only ClassA and ClassC can now inherit the SealedClass
 */
public sealed class SealedClass permits ClassA , ClassC {

}
