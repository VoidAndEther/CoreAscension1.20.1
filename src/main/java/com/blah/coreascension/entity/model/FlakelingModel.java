package com.blah.coreascension.entity.model;

import com.blah.coreascension.entity.entities.mobs.FlakelingEntity;
import com.blah.coreascension.entity.entities.mobs.SkyderEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.1
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class FlakelingModel <T extends FlakelingEntity> extends SinglePartEntityModel<T>
{
    private final ModelPart body;
    private final ModelPart Eye;
    public FlakelingModel(ModelPart root)
    {
        this.body = root.getChild("body");
        this.Eye = this.body.getChild("Eye");
    }
    public static TexturedModelData getTexturedModelData()
    {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(0, 15).cuboid(-6.0F, 6.0F, -1.0F, 13.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(0, 12).cuboid(-7.0F, -7.0F, -1.0F, 13.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(6, 18).cuboid(-7.0F, -6.0F, -1.0F, 1.0F, 13.0F, 2.0F, new Dilation(0.0F))
                .uv(0, 18).cuboid(6.0F, -7.0F, -1.0F, 1.0F, 13.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 8.0F, 0.0F, 3.1416F, 0.0F, 2.3562F));

        ModelPartData Spike_r1 = body.addChild("Spike_r1", ModelPartBuilder.create().uv(12, 18).cuboid(-0.5F, -16.5F, -0.5F, 1.0F, 12.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.309F));

        ModelPartData Spike_r2 = body.addChild("Spike_r2", ModelPartBuilder.create().uv(28, 0).cuboid(-0.5F, -16.5F, -0.5F, 1.0F, 12.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

        ModelPartData Spike_r3 = body.addChild("Spike_r3", ModelPartBuilder.create().uv(16, 18).cuboid(-0.5F, -16.5F, -0.5F, 1.0F, 12.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.8798F));

        ModelPartData Spike_r4 = body.addChild("Spike_r4", ModelPartBuilder.create().uv(24, 18).cuboid(-0.5F, -16.5F, -0.5F, 1.0F, 12.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.8326F));

        ModelPartData Spike_r5 = body.addChild("Spike_r5", ModelPartBuilder.create().uv(20, 18).cuboid(-0.5F, -15.5F, -0.5F, 1.0F, 12.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.3562F));

        ModelPartData Spike_r6 = body.addChild("Spike_r6", ModelPartBuilder.create().uv(28, 18).cuboid(-0.5F, -15.5F, -0.5F, 1.0F, 12.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

        ModelPartData Eye = body.addChild("Eye", ModelPartBuilder.create().uv(0, 0).cuboid(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));
        return TexturedModelData.of(modelData, 64, 64);
    }
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha)
    {
        body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart()
    {
        return null;
    }

    @Override
    public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch)
    {

    }
}