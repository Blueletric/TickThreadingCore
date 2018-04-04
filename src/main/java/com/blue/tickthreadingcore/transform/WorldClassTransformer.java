package com.blue.tickthreadingcore.transform;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;

import static org.objectweb.asm.Opcodes.ASM4;

public class WorldClassTransformer extends ClassVisitor {
    public WorldClassTransformer(ClassVisitor classVisitor) {
        super(ASM4, classVisitor);
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
        MethodVisitor visitor = cv.visitMethod(access, name, desc, signature, exceptions);
        if ((name.equals("k")) && (desc.equals("()V"))) {
            System.out.println("============Transforming updateEntities() !============");
            return new UpdateEntitiesMethodTransformer(visitor);
        }
        return visitor;
    }
}
