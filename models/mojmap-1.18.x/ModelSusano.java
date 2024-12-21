// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelSusano<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "susano"), "main");
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart bone5;

	public ModelSusano(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone2 = this.bone.getChild("bone2");
		this.bone3 = this.bone.getChild("bone3");
		this.bone4 = root.getChild("bone4");
		this.bone5 = root.getChild("bone5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-2.0F, -28.0F, 7.0F, 5.0F, 19.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(-11, -1)
						.addBox(-14.0F, -24.0F, 8.0F, 12.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(-10, -1)
						.addBox(3.0F, -24.0F, 8.0F, 11.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 43.0F, 2.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(-21, -4).addBox(-18.0F, -5.0F, -4.0F, 4.0F, 6.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-24.0F, -20.0F, -6.0F, 0.0F, -2.0071F, 0.0F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(-17, -1).addBox(-17.0F, -4.0F, -2.0F, 18.0F, 4.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-24.0F, -20.0F, -5.0F, 0.0F, -2.0071F, 0.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(-23, -3)
						.addBox(-21.0F, -5.0F, -3.0F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(-17, -1)
						.addBox(-17.0F, -4.0F, -2.0F, 18.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.0F, -20.0F, -3.0F, 0.0F, -1.2654F, 0.0F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(-17, -1).addBox(-17.0F, -4.0F, -2.0F, 18.0F, 4.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, -20.0F, 9.0F, 0.0F, -2.3126F, 0.0F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(-17, -1).addBox(-17.0F, -4.0F, -2.0F, 18.0F, 4.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.0F, -20.0F, 9.0F, 0.0F, -0.8727F, 0.0F));

		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(0.0F, -5.0F, 0.0F));

		PartDefinition cube_r6 = bone2.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(18, 0)
						.addBox(-1.0F, -4.0F, -8.0F, 3.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(18, 13)
						.addBox(-1.0F, -11.0F, -8.0F, 3.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-1.0F, -17.0F, -8.0F, 3.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -5.0F, 7.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r7 = bone2.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(44, 0)
						.addBox(-1.0F, -4.0F, -8.0F, 3.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(-1.0F, -11.0F, -8.0F, 3.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(26, 52)
						.addBox(-1.0F, -17.0F, -8.0F, 3.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -5.0F, 0.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition bone3 = bone.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offset(8.0F, -10.0F, 0.0F));

		PartDefinition cube_r8 = bone3.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(52, 26)
						.addBox(-1.0F, -4.0F, -8.0F, 3.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(52, 39)
						.addBox(-1.0F, -10.0F, -8.0F, 3.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(44, 13)
						.addBox(-1.0F, 3.0F, -8.0F, 3.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-16.0F, -7.0F, -1.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(26, 39)
						.addBox(-1.0F, -4.0F, -8.0F, 3.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 39)
						.addBox(-1.0F, 2.0F, -8.0F, 3.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(26, 26)
						.addBox(-1.0F, 9.0F, -8.0F, 3.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, -13.0F, 7.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone4 = partdefinition.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone5 = partdefinition.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}