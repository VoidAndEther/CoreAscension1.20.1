package com.blah.coreascension.entity.renderers;

import com.blah.coreascension.CoreAscension;
import com.blah.coreascension.entity.CoreAscensionModelLayers;
import com.blah.coreascension.entity.entities.mobs.FlakelingEntity;
import com.blah.coreascension.entity.entities.mobs.PorcupineEntity;
import com.blah.coreascension.entity.model.FlakelingModel;
import com.blah.coreascension.entity.model.PorcupineModel;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class FlakelingRenderer extends MobEntityRenderer<FlakelingEntity, FlakelingModel<FlakelingEntity>> {
    private static final Identifier TEXTURE = new Identifier(CoreAscension.MOD_ID, "textures/entity/flakeling.png");

    public FlakelingRenderer(EntityRendererFactory.Context context)
    {
        super(context, new FlakelingModel<>(context.getPart(CoreAscensionModelLayers.FLAKELING)), 0.6f);
    }


    public Identifier getTexture(FlakelingEntity entity)
    {
        return TEXTURE;
    }


    public void render(FlakelingEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i)
    {
        if (mobEntity.isBaby())
        {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else
        {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
