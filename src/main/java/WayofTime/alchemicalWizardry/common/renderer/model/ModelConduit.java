package WayofTime.alchemicalWizardry.common.renderer.model;

//Date: 11/26/2013 1:57:16 PM
//Template version 1.1
//Java generated by Techne
//Keep in mind that you still need to fill in some blanks
//- ZeuX

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumFacing;

public class ModelConduit extends ModelBase
{
    //fields
    ModelRenderer curvedInput;
    ModelRenderer curvedOutput;
    ModelRenderer straightBar1;
    ModelRenderer curvedBar1;
    ModelRenderer spacer1;
    ModelRenderer straightBar2;
    ModelRenderer curvedBar2;
    ModelRenderer spacer2;
    ModelRenderer straightBar3;
    ModelRenderer curvedBar3;
    ModelRenderer straightBar4;
    ModelRenderer curvedBar4;
    ModelRenderer spacer3;
    ModelRenderer spacer4;
    ModelRenderer spacer5;
    ModelRenderer spacer6;
    ModelRenderer spacer7;
    ModelRenderer spacer8;

    public ModelConduit()
    {
        textureWidth = 64;
        textureHeight = 32;
        curvedInput = new ModelRenderer(this, 0, 0);
        curvedInput.addBox(-2F, -2F, -8F, 4, 4, 10);
        curvedInput.setRotationPoint(0F, 16F, 0F);
        curvedInput.setTextureSize(64, 32);
        curvedInput.mirror = true;
        setRotation(curvedInput, 0F, 0F, 0F);
        curvedOutput = new ModelRenderer(this, 18, 0);
        curvedOutput.addBox(2F, -2F, -2F, 6, 4, 4);
        curvedOutput.setRotationPoint(0F, 16F, 0F);
        curvedOutput.setTextureSize(64, 32);
        curvedOutput.mirror = true;
        setRotation(curvedOutput, 0F, 0F, 0F);
        straightBar1 = new ModelRenderer(this, 0, 17);
        straightBar1.addBox(-5F, 3F, -8F, 2, 2, 13);
        straightBar1.setRotationPoint(0F, 16F, 0F);
        straightBar1.setTextureSize(64, 32);
        straightBar1.mirror = true;
        setRotation(straightBar1, 0F, 0F, 0F);
        curvedBar1 = new ModelRenderer(this, 29, 10);
        curvedBar1.addBox(-5F, 3F, 3F, 13, 2, 2);
        curvedBar1.setRotationPoint(0F, 16F, 0F);
        curvedBar1.setTextureSize(64, 32);
        curvedBar1.mirror = true;
        setRotation(curvedBar1, 0F, 0F, 0F);
        spacer1 = new ModelRenderer(this, 40, 0);
        spacer1.addBox(-5.5F, 2.5F, 2.5F, 3, 3, 3);
        spacer1.setRotationPoint(0F, 16F, 0F);
        spacer1.setTextureSize(64, 32);
        spacer1.mirror = true;
        setRotation(spacer1, 0F, 0F, 0F);
        straightBar2 = new ModelRenderer(this, 0, 17);
        straightBar2.addBox(-5F, -5F, -8F, 2, 2, 13);
        straightBar2.setRotationPoint(0F, 16F, 0F);
        straightBar2.setTextureSize(64, 32);
        straightBar2.mirror = true;
        setRotation(straightBar2, 0F, 0F, 0F);
        curvedBar2 = new ModelRenderer(this, 29, 10);
        curvedBar2.addBox(-5F, -5F, 3F, 13, 2, 2);
        curvedBar2.setRotationPoint(0F, 16F, 0F);
        curvedBar2.setTextureSize(64, 32);
        curvedBar2.mirror = true;
        setRotation(curvedBar2, 0F, 0F, 0F);
        spacer2 = new ModelRenderer(this, 40, 0);
        spacer2.addBox(-5.5F, -5.5F, 2.5F, 3, 3, 3);
        spacer2.setRotationPoint(0F, 16F, 0F);
        spacer2.setTextureSize(64, 32);
        spacer2.mirror = true;
        setRotation(spacer2, 0F, 0F, 0F);
        straightBar3 = new ModelRenderer(this, 0, 17);
        straightBar3.addBox(3F, 3F, -8F, 2, 2, 13);
        straightBar3.setRotationPoint(0F, 16F, 0F);
        straightBar3.setTextureSize(64, 32);
        straightBar3.mirror = true;
        setRotation(straightBar3, 0F, 0F, 0F);
        curvedBar3 = new ModelRenderer(this, 29, 10);
        curvedBar3.addBox(-5F, 3F, -5F, 13, 2, 2);
        curvedBar3.setRotationPoint(0F, 16F, 0F);
        curvedBar3.setTextureSize(64, 32);
        curvedBar3.mirror = true;
        setRotation(curvedBar3, 0F, 0F, 0F);
        straightBar4 = new ModelRenderer(this, 0, 17);
        straightBar4.addBox(3F, -5F, -8F, 2, 2, 13);
        straightBar4.setRotationPoint(0F, 16F, 0F);
        straightBar4.setTextureSize(64, 32);
        straightBar4.mirror = true;
        setRotation(straightBar4, 0F, 0F, 0F);
        curvedBar4 = new ModelRenderer(this, 29, 10);
        curvedBar4.addBox(-5F, -5F, -5F, 13, 2, 2);
        curvedBar4.setRotationPoint(0F, 16F, 0F);
        curvedBar4.setTextureSize(64, 32);
        curvedBar4.mirror = true;
        setRotation(curvedBar4, 0F, 0F, 0F);
        spacer3 = new ModelRenderer(this, 40, 0);
        spacer3.addBox(2.5F, 2.5F, 2.5F, 3, 3, 3);
        spacer3.setRotationPoint(0F, 16F, 0F);
        spacer3.setTextureSize(64, 32);
        spacer3.mirror = true;
        setRotation(spacer3, 0F, 0F, 0F);
        spacer4 = new ModelRenderer(this, 40, 0);
        spacer4.addBox(2.5F, 2.5F, -5.5F, 3, 3, 3);
        spacer4.setRotationPoint(0F, 16F, 0F);
        spacer4.setTextureSize(64, 32);
        spacer4.mirror = true;
        setRotation(spacer4, 0F, 0F, 0F);
        spacer5 = new ModelRenderer(this, 40, 0);
        spacer5.addBox(-5.5F, 2.5F, -5.484F, 3, 3, 3);
        spacer5.setRotationPoint(0F, 16F, 0F);
        spacer5.setTextureSize(64, 32);
        spacer5.mirror = true;
        setRotation(spacer5, 0F, 0F, 0F);
        spacer6 = new ModelRenderer(this, 40, 0);
        spacer6.addBox(2.5F, -5.5F, 2.5F, 3, 3, 3);
        spacer6.setRotationPoint(0F, 16F, 0F);
        spacer6.setTextureSize(64, 32);
        spacer6.mirror = true;
        setRotation(spacer6, 0F, 0F, 0F);
        spacer7 = new ModelRenderer(this, 40, 0);
        spacer7.addBox(2.5F, -5.5F, -5.5F, 3, 3, 3);
        spacer7.setRotationPoint(0F, 16F, 0F);
        spacer7.setTextureSize(64, 32);
        spacer7.mirror = true;
        setRotation(spacer7, 0F, 0F, 0F);
        spacer8 = new ModelRenderer(this, 40, 0);
        spacer8.addBox(-5.5F, -5.5F, -5.5F, 3, 3, 3);
        spacer8.setRotationPoint(0F, 16F, 0F);
        spacer8.setTextureSize(64, 32);
        spacer8.mirror = true;
        setRotation(spacer8, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5, EnumFacing input, EnumFacing output)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        float xInputRot = 0.0f;
        float yInputRot = 0.0f;
        float zInputRot = 0.0f;
        float xOutputRot = 0.0f;
        float yOutputRot = 0.0f;
        float zOutputRot = 0.0f;

        switch (input)
        {
            case NORTH:
                xInputRot = 0.0f;
                yInputRot = 0.0f;
                zInputRot = 0.0f;
                break;

            case EAST:
                xInputRot = 0.0f;
                yInputRot = (float) (0.5f * Math.PI);
                zInputRot = 0.0f;
                break;

            case SOUTH:
                xInputRot = 0.0f;
                yInputRot = (float) (1.0f * Math.PI);
                zInputRot = 0.0f;
                break;

            case WEST:
                xInputRot = 0.0f;
                yInputRot = (float) (-0.5f * Math.PI);
                zInputRot = 0.0f;
                break;

            case UP:
                xInputRot = (float) (-0.5f * Math.PI);
                yInputRot = 0.0f;
                zInputRot = 0.0f;
                break;

            case DOWN:
                xInputRot = (float) (0.5f * Math.PI);
                yInputRot = 0.0f;
                zInputRot = 0.0f;
                break;

            default:
                break;
        }

        switch (output)
        {
            case NORTH:
                xOutputRot = 0.0f;
                yOutputRot = (float) (0.5f * Math.PI);
                zOutputRot = 0.0f;
                break;

            case EAST:
                xOutputRot = 0.0f;
                yOutputRot = (float) (1.0f * Math.PI);
                zOutputRot = 0.0f;
                break;

            case SOUTH:
                xOutputRot = 0.0f;
                yOutputRot = (float) (-0.5f * Math.PI);
                zOutputRot = 0.0f;
                break;

            case WEST:
                xOutputRot = 0.0f;
                yOutputRot = 0.0f;
                zOutputRot = 0.0f;
                break;

            case UP:
                xOutputRot = 0.0f;
                yOutputRot = 0.0f;
                zOutputRot = (float) (-0.5f * Math.PI);
                break;

            case DOWN:
                xOutputRot = 0.0f;
                yOutputRot = 0.0f;
                zOutputRot = (float) (0.5f * Math.PI);
                break;

            default:
                break;
        }

        this.setRotation(curvedInput, xInputRot, yInputRot, zInputRot);
        this.setRotation(curvedOutput, xOutputRot, yOutputRot, zOutputRot);
        this.setRotation(straightBar1, xInputRot, yInputRot, zInputRot);
        this.setRotation(curvedBar1, xOutputRot, yOutputRot, zOutputRot);
        this.setRotation(straightBar2, xInputRot, yInputRot, zInputRot);
        this.setRotation(curvedBar2, xOutputRot, yOutputRot, zOutputRot);
        this.setRotation(straightBar3, xInputRot, yInputRot, zInputRot);
        this.setRotation(curvedBar3, xOutputRot, yOutputRot, zOutputRot);
        this.setRotation(straightBar4, xInputRot, yInputRot, zInputRot);
        this.setRotation(curvedBar4, xOutputRot, yOutputRot, zOutputRot);
        curvedInput.render(f5);
        curvedOutput.render(f5);
        //setRotation(curvedOutput,0F,-(float)(Math.PI/2),0F);
        straightBar1.render(f5);
        curvedBar1.render(f5);
        spacer1.render(f5);
        straightBar2.render(f5);
        curvedBar2.render(f5);
        spacer2.render(f5);
        straightBar3.render(f5);
        curvedBar3.render(f5);
        straightBar4.render(f5);
        curvedBar4.render(f5);
        spacer3.render(f5);
        spacer4.render(f5);
        spacer5.render(f5);
        spacer6.render(f5);
        spacer7.render(f5);
        spacer8.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }
}
