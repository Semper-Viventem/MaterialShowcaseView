package uk.co.deanwild.materialshowcaseviewsample;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import uk.co.deanwild.materialshowcaseview.MaterialShowcaseView;
import uk.co.deanwild.materialshowcaseview.ShowcaseConfig;

public class ExampleBottomSheetDialogFragment extends BottomSheetDialogFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_bottom_sheet, container);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presentShowcaseView(view, 500);
    }

    private void presentShowcaseView(View targetView, int withDelay) {

        ShowcaseConfig config = new ShowcaseConfig();
        config.setTitleTextAppearance(R.style.TextAppearance_AppCompat_Large);
        config.setContentTextAppearance(R.style.TextAppearance_AppCompat_Medium);
        config.setTitleTextColor(getResources().getColor(android.R.color.white));
        config.setContentTextColor(getResources().getColor(android.R.color.white));
        config.setDismissButtonColor(getResources().getColor(R.color.orange));
        config.setDismissTextColor(getResources().getColor(android.R.color.white));

        new MaterialShowcaseView.Builder(getContext())
                .setConfing(config)
                .setTarget(targetView)
                .setTitleText("Hello")
                .setTitleTextGravity(Gravity.CENTER_HORIZONTAL)
                .setContentText("This is some amazing\nfeature you should know about")
                .setContentTextGravity(Gravity.CENTER_HORIZONTAL)
                .setDelay(withDelay) // optional but starting animations immediately in onCreate can make them choppy
                .setDismissOnTouch(true)
                .useFadeAnimation()
                .withRectangleShape()
                .show(this);
    }
}
