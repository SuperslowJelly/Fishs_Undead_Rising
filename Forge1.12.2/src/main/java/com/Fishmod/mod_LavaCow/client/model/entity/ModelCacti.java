package com.Fishmod.mod_LavaCow.client.model.entity;

import com.Fishmod.mod_LavaCow.client.model.FishModelBase;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelCacti - Fish0016054
 * Created using Tabula 7.1.0
 */
public class ModelCacti extends FishModelBase {
    public ModelRenderer Body_base;
    public ModelRenderer Leg0_Seg0;
    public ModelRenderer Leg1_Seg0;
    public ModelRenderer Leg2_Seg0;
    public ModelRenderer Body_Seg1;
    public ModelRenderer Leg0_Seg1;
    public ModelRenderer Leg0_Seg2;
    public ModelRenderer Leg1_Seg1;
    public ModelRenderer Leg1_Seg2;
    public ModelRenderer Leg2_Seg1;
    public ModelRenderer Leg2_Seg2;
    public ModelRenderer Body_Seg2;
    public ModelRenderer thorn0_Seg1;
    public ModelRenderer thorn1_Seg1;
    public ModelRenderer Head;
    public ModelRenderer Limb0_Seg0;
    public ModelRenderer Limb1_Seg0;
    public ModelRenderer thorn0_Seg2;
    public ModelRenderer thorn1_Seg2;
    public ModelRenderer Head_Flower0;
    public ModelRenderer Head_Flower1;
    public ModelRenderer Limb0_Seg1;
    public ModelRenderer Limb0_Fruit0;
    public ModelRenderer Limb0_Fruit1;
    public ModelRenderer Limb0_Fruit2;
    public ModelRenderer Limb1_Seg1;
    public ModelRenderer Limb1_Fruit0;
    public ModelRenderer Limb1_Fruit1;

    public ModelCacti() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.Body_Seg2 = new ModelRenderer(this, 32, 26);
        this.Body_Seg2.setRotationPoint(0.0F, -11.0F, 0.0F);
        this.Body_Seg2.addBox(-4.0F, -12.0F, -4.0F, 8, 12, 8, 0.0F);
        this.Limb0_Fruit1 = new ModelRenderer(this, 0, 0);
        this.Limb0_Fruit1.mirror = true;
        this.Limb0_Fruit1.setRotationPoint(3.9F, -13.0F, 0.7F);
        this.Limb0_Fruit1.addBox(-1.0F, -4.0F, -1.0F, 2, 4, 2, 0.0F);
        this.thorn1_Seg2 = new ModelRenderer(this, 89, 14);
        this.thorn1_Seg2.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.thorn1_Seg2.addBox(-7.0F, -12.0F, 0.0F, 14, 12, 0, 0.0F);
        this.setRotateAngle(thorn1_Seg2, 0.0F, -0.7853981633974483F, 0.0F);
        this.Leg1_Seg1 = new ModelRenderer(this, 0, 43);
        this.Leg1_Seg1.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Leg1_Seg1.addBox(-2.0F, -2.0F, -4.0F, 4, 5, 4, 0.0F);
        this.setRotateAngle(Leg1_Seg1, -0.22759093446006054F, 0.0F, 0.0F);
        this.thorn1_Seg1 = new ModelRenderer(this, 89, 14);
        this.thorn1_Seg1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.thorn1_Seg1.addBox(-7.0F, -12.0F, 0.0F, 14, 12, 0, 0.0F);
        this.setRotateAngle(thorn1_Seg1, 0.0F, -0.7853981633974483F, 0.0F);
        this.thorn0_Seg2 = new ModelRenderer(this, 89, 14);
        this.thorn0_Seg2.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.thorn0_Seg2.addBox(-7.0F, -12.0F, 0.0F, 14, 12, 0, 0.0F);
        this.setRotateAngle(thorn0_Seg2, 0.0F, 0.7853981633974483F, 0.0F);
        this.Leg2_Seg0 = new ModelRenderer(this, 0, 37);
        this.Leg2_Seg0.setRotationPoint(0.0F, -2.0F, 5.0F);
        this.Leg2_Seg0.addBox(-1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Leg2_Seg0, 0.0F, 3.141592653589793F, 0.0F);
        this.Body_base = new ModelRenderer(this, 24, 49);
        this.Body_base.setRotationPoint(0.0F, 18.5F, 0.0F);
        this.Body_base.addBox(-5.0F, -5.0F, -5.0F, 10, 5, 10, 0.0F);
        this.Leg0_Seg1 = new ModelRenderer(this, 0, 43);
        this.Leg0_Seg1.mirror = true;
        this.Leg0_Seg1.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Leg0_Seg1.addBox(-2.0F, -2.0F, -4.0F, 4, 5, 4, 0.0F);
        this.setRotateAngle(Leg0_Seg1, -0.22759093446006054F, 0.0F, 0.0F);
        this.Limb1_Seg0 = new ModelRenderer(this, 0, 20);
        this.Limb1_Seg0.setRotationPoint(-4.0F, -3.0F, -0.5F);
        this.Limb1_Seg0.addBox(-1.0F, -2.0F, -2.0F, 6, 4, 4, 0.0F);
        this.setRotateAngle(Limb1_Seg0, 0.0F, 3.141592653589793F, 0.22759093446006054F);
        this.Leg1_Seg0 = new ModelRenderer(this, 0, 37);
        this.Leg1_Seg0.setRotationPoint(-4.0F, -2.0F, -4.0F);
        this.Leg1_Seg0.addBox(-1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Leg1_Seg0, 0.0F, 0.9105382707654417F, 0.0F);
        this.Body_Seg1 = new ModelRenderer(this, 32, 26);
        this.Body_Seg1.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.Body_Seg1.addBox(-4.0F, -12.0F, -4.0F, 8, 12, 8, 0.0F);
        this.Limb0_Seg1 = new ModelRenderer(this, 40, 0);
        this.Limb0_Seg1.mirror = true;
        this.Limb0_Seg1.setRotationPoint(4.5F, -0.5F, 0.0F);
        this.Limb0_Seg1.addBox(0.0F, -13.0F, -3.0F, 6, 16, 6, 0.0F);
        this.setRotateAngle(Limb0_Seg1, 0.0F, 0.0F, 0.27314402793711257F);
        this.Limb1_Fruit1 = new ModelRenderer(this, 0, 0);
        this.Limb1_Fruit1.setRotationPoint(4.8F, -8.8F, -0.2F);
        this.Limb1_Fruit1.addBox(-1.0F, -4.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(Limb1_Fruit1, 0.0F, -0.27314402793711257F, 0.136659280431156F);
        this.Head_Flower0 = new ModelRenderer(this, 0, 28);
        this.Head_Flower0.setRotationPoint(-4.2F, -8.4F, -2.8F);
        this.Head_Flower0.addBox(-2.0F, -4.0F, -2.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(Head_Flower0, 0.40980330836826856F, 0.0F, -0.27314402793711257F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0.0F, -11.0F, 0.0F);
        this.Head.addBox(-5.0F, -10.0F, -5.0F, 10, 10, 10, 0.0F);
        this.Leg0_Seg0 = new ModelRenderer(this, 0, 37);
        this.Leg0_Seg0.mirror = true;
        this.Leg0_Seg0.setRotationPoint(4.0F, -2.0F, -4.0F);
        this.Leg0_Seg0.addBox(-1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Leg0_Seg0, 0.0F, -0.9105382707654417F, 0.0F);
        this.Limb1_Seg1 = new ModelRenderer(this, 64, 0);
        this.Limb1_Seg1.setRotationPoint(4.5F, 0.0F, -0.5F);
        this.Limb1_Seg1.addBox(0.0F, -9.5F, -3.0F, 6, 12, 6, 0.0F);
        this.setRotateAngle(Limb1_Seg1, 0.0F, 0.0F, 0.22759093446006054F);
        this.Head_Flower1 = new ModelRenderer(this, 77, 0);
        this.Head_Flower1.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.Head_Flower1.addBox(-6.0F, 0.0F, -6.0F, 12, 0, 12, 0.0F);
        this.Limb0_Fruit0 = new ModelRenderer(this, 0, 0);
        this.Limb0_Fruit0.setRotationPoint(1.0F, -12.0F, -1.0F);
        this.Limb0_Fruit0.addBox(-1.0F, -4.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(Limb0_Fruit0, 0.0F, -0.091106186954104F, -0.40980330836826856F);
        this.Limb0_Seg0 = new ModelRenderer(this, 0, 20);
        this.Limb0_Seg0.mirror = true;
        this.Limb0_Seg0.setRotationPoint(4.0F, -6.0F, -0.5F);
        this.Limb0_Seg0.addBox(-1.0F, -2.0F, -2.0F, 6, 4, 4, 0.0F);
        this.setRotateAngle(Limb0_Seg0, 0.0F, 0.0F, -0.27314402793711257F);
        this.Limb0_Fruit2 = new ModelRenderer(this, 0, 0);
        this.Limb0_Fruit2.setRotationPoint(5.3F, -10.1F, 0.0F);
        this.Limb0_Fruit2.addBox(-1.0F, -4.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(Limb0_Fruit2, 0.0F, 0.27314402793711257F, 0.9105382707654417F);
        this.Leg2_Seg2 = new ModelRenderer(this, 0, 52);
        this.Leg2_Seg2.setRotationPoint(0.0F, 2.0F, -2.0F);
        this.Leg2_Seg2.addBox(-3.0F, 0.0F, -3.0F, 6, 6, 6, 0.0F);
        this.setRotateAngle(Leg2_Seg2, 0.22759093446006054F, 0.0F, 0.0F);
        this.Leg0_Seg2 = new ModelRenderer(this, 0, 52);
        this.Leg0_Seg2.mirror = true;
        this.Leg0_Seg2.setRotationPoint(0.0F, 2.0F, -2.0F);
        this.Leg0_Seg2.addBox(-3.0F, 0.0F, -3.0F, 6, 6, 6, 0.0F);
        this.setRotateAngle(Leg0_Seg2, 0.22759093446006054F, 0.0F, 0.0F);
        this.Limb1_Fruit0 = new ModelRenderer(this, 0, 0);
        this.Limb1_Fruit0.mirror = true;
        this.Limb1_Fruit0.setRotationPoint(1.8F, -8.8F, -1.0F);
        this.Limb1_Fruit0.addBox(-1.0F, -4.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(Limb1_Fruit0, 0.0F, 0.091106186954104F, -0.27314402793711257F);
        this.Leg1_Seg2 = new ModelRenderer(this, 0, 52);
        this.Leg1_Seg2.setRotationPoint(0.0F, 2.0F, -2.0F);
        this.Leg1_Seg2.addBox(-3.0F, 0.0F, -3.0F, 6, 6, 6, 0.0F);
        this.setRotateAngle(Leg1_Seg2, 0.22759093446006054F, 0.0F, 0.0F);
        this.Leg2_Seg1 = new ModelRenderer(this, 0, 43);
        this.Leg2_Seg1.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Leg2_Seg1.addBox(-2.0F, -2.0F, -4.0F, 4, 5, 4, 0.0F);
        this.setRotateAngle(Leg2_Seg1, -0.22759093446006054F, 0.0F, 0.0F);
        this.thorn0_Seg1 = new ModelRenderer(this, 89, 14);
        this.thorn0_Seg1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.thorn0_Seg1.addBox(-7.0F, -12.0F, 0.0F, 14, 12, 0, 0.0F);
        this.setRotateAngle(thorn0_Seg1, 0.0F, 0.7853981633974483F, 0.0F);
        this.Body_Seg1.addChild(this.Body_Seg2);
        this.Limb0_Seg1.addChild(this.Limb0_Fruit1);
        this.Body_Seg2.addChild(this.thorn1_Seg2);
        this.Leg1_Seg0.addChild(this.Leg1_Seg1);
        this.Body_Seg1.addChild(this.thorn1_Seg1);
        this.Body_Seg2.addChild(this.thorn0_Seg2);
        this.Body_base.addChild(this.Leg2_Seg0);
        this.Leg0_Seg0.addChild(this.Leg0_Seg1);
        this.Body_Seg2.addChild(this.Limb1_Seg0);
        this.Body_base.addChild(this.Leg1_Seg0);
        this.Body_base.addChild(this.Body_Seg1);
        this.Limb0_Seg0.addChild(this.Limb0_Seg1);
        this.Limb1_Seg1.addChild(this.Limb1_Fruit1);
        this.Head.addChild(this.Head_Flower0);
        this.Body_Seg2.addChild(this.Head);
        this.Body_base.addChild(this.Leg0_Seg0);
        this.Limb1_Seg0.addChild(this.Limb1_Seg1);
        this.Head_Flower0.addChild(this.Head_Flower1);
        this.Limb0_Seg1.addChild(this.Limb0_Fruit0);
        this.Body_Seg2.addChild(this.Limb0_Seg0);
        this.Limb0_Seg1.addChild(this.Limb0_Fruit2);
        this.Leg2_Seg1.addChild(this.Leg2_Seg2);
        this.Leg0_Seg1.addChild(this.Leg0_Seg2);
        this.Limb1_Seg1.addChild(this.Limb1_Fruit0);
        this.Leg1_Seg1.addChild(this.Leg1_Seg2);
        this.Leg2_Seg0.addChild(this.Leg2_Seg1);
        this.Body_Seg1.addChild(this.thorn0_Seg1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Body_base.render(f5);
    }
}