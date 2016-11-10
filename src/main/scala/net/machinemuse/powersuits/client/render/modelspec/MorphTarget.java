package net.machinemuse.powersuits.client.render.modelspec;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;

/**
 * Ported to Java by lehjr on 11/8/16.
 */
public enum MorphTarget {
    Cloak,
    Head,
    Body,
    RightArm,
    LeftArm,
    RightLeg,
    LeftLeg;

    private interface iMorphTarget {
        String name = null;
        float degrad = (float) (180F / Math.PI);

        ModelRenderer apply(ModelBiped m);
    }

    public ModelRenderer apply(ModelBiped m) {
        switch(this) {
            case Cloak:
                return Cloak.apply(m);

            case Head:
                return Head.apply(m);

            case Body:
                return Body.apply(m);

            case RightArm:
                return RightArm.apply(m);

            case LeftArm:
                return LeftArm.apply(m);

            case RightLeg:
                return RightLeg.apply(m);

            case LeftLeg:
                return LeftLeg.apply(m);

            default:
                return null;
        }
    }

    public class Cloak implements iMorphTarget {
        String name = "Cloak";

        @Override
        public ModelRenderer apply(ModelBiped m) {
            return m.bipedCloak;
        }
    }

    public class Head implements iMorphTarget {
        String name = "Head";

        @Override
        public ModelRenderer apply(ModelBiped m) {
            return m.bipedHead;
        }
    }

    public class Body implements iMorphTarget {
        String name = "Body";

        @Override
        public ModelRenderer apply(ModelBiped m) {
            return m.bipedBody;
        }
    }

    public class RightArm implements iMorphTarget {
        String name = "RightArm";

        @Override
        public ModelRenderer apply(ModelBiped m) {
            return m.bipedRightArm;
        }
    }

    public class LeftArm implements iMorphTarget {
        String name = "LeftArm";

        @Override
        public ModelRenderer apply(ModelBiped m) {
            return m.bipedLeftArm;
        }
    }

    public class RightLeg implements iMorphTarget {
        String name = "RightLeg";

        @Override
        public ModelRenderer apply(ModelBiped m) {
            return m.bipedRightLeg;
        }
    }

    public class LeftLeg implements iMorphTarget {
        String name = "LeftLeg";

        @Override
        public ModelRenderer apply(ModelBiped m) {
            return m.bipedLeftLeg;
        }
    }
}