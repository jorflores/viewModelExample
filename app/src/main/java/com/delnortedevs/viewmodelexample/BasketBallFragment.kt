package com.delnortedevs.viewmodelexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.delnortedevs.viewmodelexample.databinding.FragmentBasketBallBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BasketBallFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BasketBallFragment : Fragment() {
    // TODO: Rename and change types of parameters

    private var _binding: FragmentBasketBallBinding? = null
    private val binding get() = _binding!!

    private val viewModel: ScoreViewModel by activityViewModels()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        _binding = FragmentBasketBallBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        showScores()

        binding.buttonA1.setOnClickListener {
            viewModel.addScoreA(1)
            showScores()
        }
        binding.buttonA2.setOnClickListener {
            viewModel.addScoreA(2)
            showScores()
        }

        binding.buttonA3.setOnClickListener {
            viewModel.addScoreA(3)
            showScores()
        }
        binding.buttonB1.setOnClickListener {
            viewModel.addScoreB(1)
            showScores()
        }
        binding.buttonB2.setOnClickListener {
            viewModel.addScoreB(2)
            showScores()
        }
        binding.buttonB3.setOnClickListener {
            viewModel.addScoreB(3)
            showScores()
        }
        binding.buttonReset.setOnClickListener {
            viewModel.resetScores()
            showScores()
        }
    }

    private fun showScores() {
        binding.teamAScore.text = viewModel.scoreTeamA.toString()
        binding.teamBScore.text = viewModel.scoreTeamB.toString()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}