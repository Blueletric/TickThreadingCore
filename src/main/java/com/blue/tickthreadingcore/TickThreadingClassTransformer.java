package com.blue.tickthreadingcore;

import com.blue.tickthreadingcore.transform.WorldClassTransformer;
import net.minecraft.launchwrapper.IClassTransformer;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;

public class TickThreadingClassTransformer implements IClassTransformer{
    private static final String[] classStrings = new String[] {
            "net.minecraft.world.World"
    };
    @Override
    public byte[] transform(String name, String transformedName, byte[] basicClass) {
        int origLength = basicClass.length;
        for (int i=0; i<classStrings.length; i++) {
            if (classStrings[i].equals(transformedName)) {
                System.out.println("World obfuscated: " + name);
                System.out.println("Patching World class...");
                ClassReader reader = new ClassReader(basicClass);
                ClassWriter writer = new ClassWriter(0);
                WorldClassTransformer transformer = new WorldClassTransformer(writer);
                reader.accept(transformer, 0);
                basicClass = writer.toByteArray();
                break;
            }
        }
        if (origLength != basicClass.length) {
            System.out.println("Length modified!");
        }

        return basicClass;
    }
}
