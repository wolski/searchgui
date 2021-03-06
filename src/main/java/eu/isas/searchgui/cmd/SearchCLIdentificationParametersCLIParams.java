package eu.isas.searchgui.cmd;

import com.compomics.util.experiment.identification.parameters_cli.IdentificationParametersCLIParams;
import org.apache.commons.cli.Options;

/**
 * This class provides the parameters which can be used for the identification
 * parameters cli in SearchGUI.
 *
 * @author Marc Vaudel
 * @author Harald Barsnes
 */
public class SearchCLIdentificationParametersCLIParams {

    /**
     * Creates the options for the command line interface based on the possible
     * values.
     *
     * @param aOptions the options object where the options will be added
     */
    public static void createOptionsCLI(Options aOptions) {
        for (IdentificationParametersCLIParams identificationParametersCLIParams : IdentificationParametersCLIParams.values()) {
            aOptions.addOption(identificationParametersCLIParams.id, identificationParametersCLIParams.hasArgument, identificationParametersCLIParams.description);
        }
    }

    /**
     * Returns the options as a string.
     *
     * @return the options as a string
     */
    public static String getOptionsAsString() {

        String output = "";
        String formatter = "%-35s";

        output += "Parameters Files:\n\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OUT.id) + " " + IdentificationParametersCLIParams.OUT.description + " (Mandatory)\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.IDENTIFICATION_PARAMETERS.id) + " " + IdentificationParametersCLIParams.IDENTIFICATION_PARAMETERS.description + " (Optional)\n";
        output += getParametersOptionsAsString();
        return output;
    }

    /**
     * Returns the options as a string.
     *
     * @return the options as a string
     */
    public static String getParametersOptionsAsString() {

        String output = "";
        String formatter = "%-25s";

        output += "\n\nSearch Parameters:\n\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.DB.id) + " " + IdentificationParametersCLIParams.DB.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.PREC_TOL.id) + " " + IdentificationParametersCLIParams.PREC_TOL.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.PREC_PPM.id) + " " + IdentificationParametersCLIParams.PREC_PPM.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.FRAG_TOL.id) + " " + IdentificationParametersCLIParams.FRAG_TOL.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.ENZYME.id) + " " + IdentificationParametersCLIParams.ENZYME.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.FIXED_MODS.id) + " " + IdentificationParametersCLIParams.FIXED_MODS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.VARIABLE_MODS.id) + " " + IdentificationParametersCLIParams.VARIABLE_MODS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MIN_CHARGE.id) + " " + IdentificationParametersCLIParams.MIN_CHARGE.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MAX_CHARGE.id) + " " + IdentificationParametersCLIParams.MAX_CHARGE.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MC.id) + " " + IdentificationParametersCLIParams.MC.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.FI.id) + " " + IdentificationParametersCLIParams.FI.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.RI.id) + " " + IdentificationParametersCLIParams.RI.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MIN_ISOTOPE.id) + " " + IdentificationParametersCLIParams.MIN_ISOTOPE.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MAX_ISOTOPE.id) + " " + IdentificationParametersCLIParams.MAX_ISOTOPE.description + "\n";

        output += "\n\nX!Tandem advanced parameters:\n\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.XTANDEM_DYNAMIC_RANGE.id) + " " + IdentificationParametersCLIParams.XTANDEM_DYNAMIC_RANGE.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.XTANDEM_NPEAKS.id) + " " + IdentificationParametersCLIParams.XTANDEM_NPEAKS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.XTANDEM_MIN_FRAG_MZ.id) + " " + IdentificationParametersCLIParams.XTANDEM_MIN_FRAG_MZ.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.XTANDEM_MIN_PEAKS.id) + " " + IdentificationParametersCLIParams.XTANDEM_MIN_PEAKS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.XTANDEM_NOISE_SUPPRESSION.id) + " " + IdentificationParametersCLIParams.XTANDEM_NOISE_SUPPRESSION.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.XTANDEM_MIN_PREC_MASS.id) + " " + IdentificationParametersCLIParams.XTANDEM_MIN_PREC_MASS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.XTANDEM_QUICK_ACETYL.id) + " " + IdentificationParametersCLIParams.XTANDEM_QUICK_ACETYL.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.XTANDEM_QUICK_PYRO.id) + " " + IdentificationParametersCLIParams.XTANDEM_QUICK_PYRO.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.XTANDEM_STP_BIAS.id) + " " + IdentificationParametersCLIParams.XTANDEM_STP_BIAS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.XTANDEM_REFINE.id) + " " + IdentificationParametersCLIParams.XTANDEM_REFINE.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.XTANDEM_REFINE_EVALUE.id) + " " + IdentificationParametersCLIParams.XTANDEM_REFINE_EVALUE.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.XTANDEM_REFINE_UNANTICIPATED_CLEAVAGE.id) + " " + IdentificationParametersCLIParams.XTANDEM_REFINE_UNANTICIPATED_CLEAVAGE.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.XTANDEM_REFINE_SEMI.id) + " " + IdentificationParametersCLIParams.XTANDEM_REFINE_SEMI.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.XTANDEM_REFINE_POTENTIAL_MOD_FULL_REFINEMENT.id) + " " + IdentificationParametersCLIParams.XTANDEM_REFINE_POTENTIAL_MOD_FULL_REFINEMENT.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.XTANDEM_REFINE_POINT_MUTATIONS.id) + " " + IdentificationParametersCLIParams.XTANDEM_REFINE_POINT_MUTATIONS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.XTANDEM_REFINE_SNAPS.id) + " " + IdentificationParametersCLIParams.XTANDEM_REFINE_SNAPS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.XTANDEM_REFINE_SPECTRUM_SYNTHESIS.id) + " " + IdentificationParametersCLIParams.XTANDEM_REFINE_SPECTRUM_SYNTHESIS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.XTANDEM_EVALUE.id) + " " + IdentificationParametersCLIParams.XTANDEM_EVALUE.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.XTANDEM_OUTPUT_PROTEINS.id) + " " + IdentificationParametersCLIParams.XTANDEM_OUTPUT_PROTEINS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.XTANDEM_OUTPUT_SEQUENCES.id) + " " + IdentificationParametersCLIParams.XTANDEM_OUTPUT_SEQUENCES.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.XTANDEM_OUTPUT_SPECTRA.id) + " " + IdentificationParametersCLIParams.XTANDEM_OUTPUT_SPECTRA.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.XTANDEM_SKYLINE.id) + " " + IdentificationParametersCLIParams.XTANDEM_SKYLINE.description + "\n";

        output += "\n\nMyriMatch advanced parameters:\n\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MYRIMATCH_MIN_PEP_LENGTH.id) + " " + IdentificationParametersCLIParams.MYRIMATCH_MIN_PEP_LENGTH.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MYRIMATCH_MAX_PEP_LENGTH.id) + " " + IdentificationParametersCLIParams.MYRIMATCH_MAX_PEP_LENGTH.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MYRIMATCH_MIN_PREC_MASS.id) + " " + IdentificationParametersCLIParams.MYRIMATCH_MIN_PREC_MASS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MYRIMATCH_MAX_PREC_MASS.id) + " " + IdentificationParametersCLIParams.MYRIMATCH_MAX_PREC_MASS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MYRIMATCH_NUM_MATCHES.id) + " " + IdentificationParametersCLIParams.MYRIMATCH_NUM_MATCHES.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MYRIMATCH_PTMS.id) + " " + IdentificationParametersCLIParams.MYRIMATCH_PTMS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MYRIMATCH_FRAGMENTATION.id) + " " + IdentificationParametersCLIParams.MYRIMATCH_FRAGMENTATION.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MYRIMATCH_TERMINI.id) + " " + IdentificationParametersCLIParams.MYRIMATCH_TERMINI.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MYRIMATCH_SMART_PLUS_THREE.id) + " " + IdentificationParametersCLIParams.MYRIMATCH_SMART_PLUS_THREE.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MYRIMATCH_XCORR.id) + " " + IdentificationParametersCLIParams.MYRIMATCH_XCORR.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MYRIMATCH_TIC_CUTOFF.id) + " " + IdentificationParametersCLIParams.MYRIMATCH_TIC_CUTOFF.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MYRIMATCH_INTENSTITY_CLASSES.id) + " " + IdentificationParametersCLIParams.MYRIMATCH_INTENSTITY_CLASSES.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MYRIMATCH_CLASS_MULTIPLIER.id) + " " + IdentificationParametersCLIParams.MYRIMATCH_CLASS_MULTIPLIER.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MYRIMATCH_NUM_BATCHES.id) + " " + IdentificationParametersCLIParams.MYRIMATCH_NUM_BATCHES.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MYRIMATCH_MAX_PEAK_COUNT.id) + " " + IdentificationParametersCLIParams.MYRIMATCH_MAX_PEAK_COUNT.description + "\n";

        output += "\n\nMS Amanda advanced parameters:\n\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MS_AMANDA_DECOY.id) + " " + IdentificationParametersCLIParams.MS_AMANDA_DECOY.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MS_AMANDA_INSTRUMENT.id) + " " + IdentificationParametersCLIParams.MS_AMANDA_INSTRUMENT.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MS_AMANDA_MAX_RANK.id) + " " + IdentificationParametersCLIParams.MS_AMANDA_MAX_RANK.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MS_AMANDA_MONOISOTOPIC.id) + " " + IdentificationParametersCLIParams.MS_AMANDA_MONOISOTOPIC.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MS_AMANDA_LOW_MEM_MODE.id) + " " + IdentificationParametersCLIParams.MS_AMANDA_LOW_MEM_MODE.description + "\n";

        output += "\n\nMS-GF+ advanced parameters:\n\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MSGF_DECOY.id) + " " + IdentificationParametersCLIParams.MSGF_DECOY.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MSGF_INSTRUMENT.id) + " " + IdentificationParametersCLIParams.MSGF_INSTRUMENT.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MSGF_FRAGMENTATION.id) + " " + IdentificationParametersCLIParams.MSGF_FRAGMENTATION.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MSGF_PROTOCOL.id) + " " + IdentificationParametersCLIParams.MSGF_PROTOCOL.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MSGF_MIN_PEP_LENGTH.id) + " " + IdentificationParametersCLIParams.MSGF_MIN_PEP_LENGTH.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MSGF_MAX_PEP_LENGTH.id) + " " + IdentificationParametersCLIParams.MSGF_MAX_PEP_LENGTH.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MSGF_NUM_MATCHES.id) + " " + IdentificationParametersCLIParams.MSGF_NUM_MATCHES.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MSGF_ADDITIONAL.id) + " " + IdentificationParametersCLIParams.MSGF_ADDITIONAL.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MSGF_TERMINI.id) + " " + IdentificationParametersCLIParams.MSGF_TERMINI.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MSGF_PTMS.id) + " " + IdentificationParametersCLIParams.MSGF_PTMS.description + "\n";

        output += "\n\nOMSSA advanced parameters:\n\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_REMOVE_PREC.id) + " " + IdentificationParametersCLIParams.OMSSA_REMOVE_PREC.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_SCALE_PREC.id) + " " + IdentificationParametersCLIParams.OMSSA_SCALE_PREC.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_ESTIMATE_CHARGE.id) + " " + IdentificationParametersCLIParams.OMSSA_ESTIMATE_CHARGE.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_MAX_EVALUE.id) + " " + IdentificationParametersCLIParams.OMSSA_MAX_EVALUE.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_HITLIST_LENGTH.id) + " " + IdentificationParametersCLIParams.OMSSA_HITLIST_LENGTH.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_HITLIST_LENGTH_CHARGE.id) + " " + IdentificationParametersCLIParams.OMSSA_HITLIST_LENGTH_CHARGE.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_MIN_PEP_LENGTH.id) + " " + IdentificationParametersCLIParams.OMSSA_MIN_PEP_LENGTH.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_MAX_PEP_LENGTH.id) + " " + IdentificationParametersCLIParams.OMSSA_MAX_PEP_LENGTH.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_FORMAT.id) + " " + IdentificationParametersCLIParams.OMSSA_FORMAT.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_SEQUENCES_IN_MEMORY.id) + " " + IdentificationParametersCLIParams.OMSSA_SEQUENCES_IN_MEMORY.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_NEUTRON.id) + " " + IdentificationParametersCLIParams.OMSSA_NEUTRON.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_LOW_INTENSITY.id) + " " + IdentificationParametersCLIParams.OMSSA_LOW_INTENSITY.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_HIGH_INTENSITY.id) + " " + IdentificationParametersCLIParams.OMSSA_HIGH_INTENSITY.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_INTENSITY_INCREMENT.id) + " " + IdentificationParametersCLIParams.OMSSA_INTENSITY_INCREMENT.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_SINGLE_WINDOW_WIDTH.id) + " " + IdentificationParametersCLIParams.OMSSA_SINGLE_WINDOW_WIDTH.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_DOUBLE_WINDOW_WIDTH.id) + " " + IdentificationParametersCLIParams.OMSSA_DOUBLE_WINDOW_WIDTH.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_SINGLE_WINDOW_PEAKS.id) + " " + IdentificationParametersCLIParams.OMSSA_SINGLE_WINDOW_PEAKS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_DOUBLE_WINDOW_PEAKS.id) + " " + IdentificationParametersCLIParams.OMSSA_DOUBLE_WINDOW_PEAKS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_MIN_ANNOTATED_INTENSE_PEAKS.id) + " " + IdentificationParametersCLIParams.OMSSA_MIN_ANNOTATED_INTENSE_PEAKS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_MIN_PEAKS.id) + " " + IdentificationParametersCLIParams.OMSSA_MIN_PEAKS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_METHIONINE.id) + " " + IdentificationParametersCLIParams.OMSSA_METHIONINE.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_MAX_LADDERS.id) + " " + IdentificationParametersCLIParams.OMSSA_MAX_LADDERS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_MAX_FRAG_CHARGE.id) + " " + IdentificationParametersCLIParams.OMSSA_MAX_FRAG_CHARGE.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_MAX_FRACTION.id) + " " + IdentificationParametersCLIParams.OMSSA_MAX_FRACTION.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_PLUS_ONE.id) + " " + IdentificationParametersCLIParams.OMSSA_PLUS_ONE.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_POSITIVE_IONS.id) + " " + IdentificationParametersCLIParams.OMSSA_POSITIVE_IONS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_PREC_PER_SPECTRUM.id) + " " + IdentificationParametersCLIParams.OMSSA_PREC_PER_SPECTRUM.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_FORWARD_IONS.id) + " " + IdentificationParametersCLIParams.OMSSA_FORWARD_IONS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_REWIND_IONS.id) + " " + IdentificationParametersCLIParams.OMSSA_REWIND_IONS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_MAX_FRAG_SERIES.id) + " " + IdentificationParametersCLIParams.OMSSA_MAX_FRAG_SERIES.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_CORRELATION_CORRECTION.id) + " " + IdentificationParametersCLIParams.OMSSA_CORRELATION_CORRECTION.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_CONSECUTIVE_ION_PROBABILITY.id) + " " + IdentificationParametersCLIParams.OMSSA_CONSECUTIVE_ION_PROBABILITY.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_ITERATIVE_SEQUENCE_EVALUE.id) + " " + IdentificationParametersCLIParams.OMSSA_ITERATIVE_SEQUENCE_EVALUE.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_ITERATIVE_SPECTRUM_EVALUE.id) + " " + IdentificationParametersCLIParams.OMSSA_ITERATIVE_SPECTRUM_EVALUE.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.OMSSA_ITERATIVE_REPLACE_EVALUE.id) + " " + IdentificationParametersCLIParams.OMSSA_ITERATIVE_REPLACE_EVALUE.description + "\n";

        output += "\n\nComet advanced parameters:\n\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.COMET_NUM_MATCHES.id) + " " + IdentificationParametersCLIParams.COMET_NUM_MATCHES.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.COMET_PTMS.id) + " " + IdentificationParametersCLIParams.COMET_PTMS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.COMET_REQ_PTMS.id) + " " + IdentificationParametersCLIParams.COMET_REQ_PTMS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.COMET_MIN_PEAKS.id) + " " + IdentificationParametersCLIParams.COMET_MIN_PEAKS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.COMET_MIN_PEAK_INTENSITY.id) + " " + IdentificationParametersCLIParams.COMET_MIN_PEAK_INTENSITY.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.COMET_REMOVE_PRECURSOR.id) + " " + IdentificationParametersCLIParams.COMET_REMOVE_PRECURSOR.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.COMET_REMOVE_PRECURSOR_TOLERANCE.id) + " " + IdentificationParametersCLIParams.COMET_REMOVE_PRECURSOR_TOLERANCE.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.COMET_CLEAR_MZ_RANGE_LOWER.id) + " " + IdentificationParametersCLIParams.COMET_CLEAR_MZ_RANGE_LOWER.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.COMET_CLEAR_MZ_RANGE_UPPER.id) + " " + IdentificationParametersCLIParams.COMET_CLEAR_MZ_RANGE_UPPER.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.COMET_ENZYME_TYPE.id) + " " + IdentificationParametersCLIParams.COMET_ENZYME_TYPE.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.COMET_ISOTOPE_CORRECTION.id) + " " + IdentificationParametersCLIParams.COMET_ISOTOPE_CORRECTION.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.COMET_MIN_PREC_MASS.id) + " " + IdentificationParametersCLIParams.COMET_MIN_PREC_MASS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.COMET_MAX_PREC_MASS.id) + " " + IdentificationParametersCLIParams.COMET_MAX_PREC_MASS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.COMET_MAX_FRAGMENT_CHARGE.id) + " " + IdentificationParametersCLIParams.COMET_MAX_FRAGMENT_CHARGE.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.COMET_REMOVE_METH.id) + " " + IdentificationParametersCLIParams.COMET_REMOVE_METH.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.COMET_BATCH_SIZE.id) + " " + IdentificationParametersCLIParams.COMET_BATCH_SIZE.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.COMET_THEORETICAL_FRAGMENT_IONS.id) + " " + IdentificationParametersCLIParams.COMET_THEORETICAL_FRAGMENT_IONS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.COMET_FRAGMENT_BIN_OFFSET.id) + " " + IdentificationParametersCLIParams.COMET_FRAGMENT_BIN_OFFSET.description + "\n";

        output += "\n\nTide advanced parameters:\n\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_PTMS.id) + " " + IdentificationParametersCLIParams.TIDE_PTMS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_PTMS_PER_TYPE.id) + " " + IdentificationParametersCLIParams.TIDE_PTMS_PER_TYPE.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_MIN_PEP_LENGTH.id) + " " + IdentificationParametersCLIParams.TIDE_MIN_PEP_LENGTH.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_MAX_PEP_LENGTH.id) + " " + IdentificationParametersCLIParams.TIDE_MAX_PEP_LENGTH.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_MIN_PREC_MASS.id) + " " + IdentificationParametersCLIParams.TIDE_MIN_PREC_MASS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_MAX_PREC_MASS.id) + " " + IdentificationParametersCLIParams.TIDE_MAX_PREC_MASS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_DECOY_FORMAT.id) + " " + IdentificationParametersCLIParams.TIDE_DECOY_FORMAT.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_KEEP_TERM_AA.id) + " " + IdentificationParametersCLIParams.TIDE_KEEP_TERM_AA.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_DECOY_SEED.id) + " " + IdentificationParametersCLIParams.TIDE_DECOY_SEED.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_OUTPUT_FOLDER.id) + " " + IdentificationParametersCLIParams.TIDE_OUTPUT_FOLDER.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_PRINT_PEPTIDES.id) + " " + IdentificationParametersCLIParams.TIDE_PRINT_PEPTIDES.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_VERBOSITY.id) + " " + IdentificationParametersCLIParams.TIDE_VERBOSITY.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_MONOISOTOPIC.id) + " " + IdentificationParametersCLIParams.TIDE_MONOISOTOPIC.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_CLIP_N_TERM.id) + " " + IdentificationParametersCLIParams.TIDE_CLIP_N_TERM.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_DIGESTION_TYPE.id) + " " + IdentificationParametersCLIParams.TIDE_DIGESTION_TYPE.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_COMPUTE_SP.id) + " " + IdentificationParametersCLIParams.TIDE_COMPUTE_SP.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_MAX_PSMS.id) + " " + IdentificationParametersCLIParams.TIDE_MAX_PSMS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_COMPUTE_P.id) + " " + IdentificationParametersCLIParams.TIDE_COMPUTE_P.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_MIN_SPECTRUM_MZ.id) + " " + IdentificationParametersCLIParams.TIDE_MIN_SPECTRUM_MZ.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_MAX_SPECTRUM_MZ.id) + " " + IdentificationParametersCLIParams.TIDE_MAX_SPECTRUM_MZ.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_MIN_SPECTRUM_PEAKS.id) + " " + IdentificationParametersCLIParams.TIDE_MIN_SPECTRUM_PEAKS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_SPECTRUM_CHARGES.id) + " " + IdentificationParametersCLIParams.TIDE_SPECTRUM_CHARGES.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_REMOVE_PREC.id) + " " + IdentificationParametersCLIParams.TIDE_REMOVE_PREC.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_REMOVE_PREC_TOL.id) + " " + IdentificationParametersCLIParams.TIDE_REMOVE_PREC_TOL.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_PROGRESS_INDICATOR.id) + " " + IdentificationParametersCLIParams.TIDE_PROGRESS_INDICATOR.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_USE_FLANKING.id) + " " + IdentificationParametersCLIParams.TIDE_USE_FLANKING.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_USE_NEUTRAL_LOSSES.id) + " " + IdentificationParametersCLIParams.TIDE_USE_NEUTRAL_LOSSES.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_MZ_BIN_WIDTH.id) + " " + IdentificationParametersCLIParams.TIDE_MZ_BIN_WIDTH.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_MZ_BIN_OFFSET.id) + " " + IdentificationParametersCLIParams.TIDE_MZ_BIN_OFFSET.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_CONCAT.id) + " " + IdentificationParametersCLIParams.TIDE_CONCAT.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_STORE_SPECTRA.id) + " " + IdentificationParametersCLIParams.TIDE_STORE_SPECTRA.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_EXPORT_TEXT.id) + " " + IdentificationParametersCLIParams.TIDE_EXPORT_TEXT.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_EXPORT_SQT.id) + " " + IdentificationParametersCLIParams.TIDE_EXPORT_SQT.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_EXPORT_PEPXML.id) + " " + IdentificationParametersCLIParams.TIDE_EXPORT_PEPXML.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_EXPORT_MZID.id) + " " + IdentificationParametersCLIParams.TIDE_EXPORT_MZID.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_EXPORT_PIN.id) + " " + IdentificationParametersCLIParams.TIDE_EXPORT_PIN.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.TIDE_REMOVE_TEMP.id) + " " + IdentificationParametersCLIParams.TIDE_REMOVE_TEMP.description + "\n";

        output += "\n\nAndromeda advanced parameters:\n\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.ANDROMEDA_MAX_PEPTIDE_MASS.id) + " " + IdentificationParametersCLIParams.ANDROMEDA_MAX_PEPTIDE_MASS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.ANDROMEDA_MAX_COMBINATIONS.id) + " " + IdentificationParametersCLIParams.ANDROMEDA_MAX_COMBINATIONS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.ANDROMEDA_TOP_PEAKS.id) + " " + IdentificationParametersCLIParams.ANDROMEDA_TOP_PEAKS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.ANDROMEDA_TOP_PEAKS_WINDOW.id) + " " + IdentificationParametersCLIParams.ANDROMEDA_TOP_PEAKS_WINDOW.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.ANDROMEDA_INCL_WATER.id) + " " + IdentificationParametersCLIParams.ANDROMEDA_INCL_WATER.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.ANDROMEDA_INCL_AMMONIA.id) + " " + IdentificationParametersCLIParams.ANDROMEDA_INCL_AMMONIA.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.ANDROMEDA_NEUTRAL_LOSSES.id) + " " + IdentificationParametersCLIParams.ANDROMEDA_NEUTRAL_LOSSES.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.ANDROMEDA_FRAGMENT_ALL.id) + " " + IdentificationParametersCLIParams.ANDROMEDA_FRAGMENT_ALL.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.ANDROMEDA_EMP_CORRECTION.id) + " " + IdentificationParametersCLIParams.ANDROMEDA_EMP_CORRECTION.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.ANDROMEDA_HIGHER_CHARGE.id) + " " + IdentificationParametersCLIParams.ANDROMEDA_HIGHER_CHARGE.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.ANDROMEDA_FRAG_METHOD.id) + " " + IdentificationParametersCLIParams.ANDROMEDA_FRAG_METHOD.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.ANDROMEDA_MAX_MODS.id) + " " + IdentificationParametersCLIParams.ANDROMEDA_MAX_MODS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.ANDROMEDA_MIN_PEP_LENGTH.id) + " " + IdentificationParametersCLIParams.ANDROMEDA_MIN_PEP_LENGTH.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.ANDROMEDA_MAX_PEP_LENGTH.id) + " " + IdentificationParametersCLIParams.ANDROMEDA_MAX_PEP_LENGTH.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.ANDROMEDA_EQUAL_IL.id) + " " + IdentificationParametersCLIParams.ANDROMEDA_EQUAL_IL.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.ANDROMEDA_MAX_PSMS.id) + " " + IdentificationParametersCLIParams.ANDROMEDA_MAX_PSMS.description + "\n";

        output += "\n\nPeptideShaker advanced parameters:\n\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.USE_GENE_MAPPING.id) + " " + IdentificationParametersCLIParams.USE_GENE_MAPPING.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.UPDATE_GENE_MAPPING.id) + " " + IdentificationParametersCLIParams.UPDATE_GENE_MAPPING.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.ANNOTATION_LEVEL.id) + " " + IdentificationParametersCLIParams.ANNOTATION_LEVEL.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.ANNOTATION_MZ_TOLERANCE.id) + " " + IdentificationParametersCLIParams.ANNOTATION_MZ_TOLERANCE.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.ANNOTATION_HIGH_RESOLUTION.id) + " " + IdentificationParametersCLIParams.ANNOTATION_HIGH_RESOLUTION.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.SEQUENCE_MATCHING_TYPE.id) + " " + IdentificationParametersCLIParams.SEQUENCE_MATCHING_TYPE.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.SEQUENCE_MATCHING_X.id) + " " + IdentificationParametersCLIParams.SEQUENCE_MATCHING_X.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.IMPORT_PEPTIDE_LENGTH_MIN.id) + " " + IdentificationParametersCLIParams.IMPORT_PEPTIDE_LENGTH_MIN.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.IMPORT_PEPTIDE_LENGTH_MAX.id) + " " + IdentificationParametersCLIParams.IMPORT_PEPTIDE_LENGTH_MAX.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.IMPORT_MC_MIN.id) + " " + IdentificationParametersCLIParams.IMPORT_MC_MIN.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.IMPORT_MC_MAX.id) + " " + IdentificationParametersCLIParams.IMPORT_MC_MAX.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.IMPORT_PRECURSOR_MZ.id) + " " + IdentificationParametersCLIParams.IMPORT_PRECURSOR_MZ.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.IMPORT_PRECURSOR_MZ_PPM.id) + " " + IdentificationParametersCLIParams.IMPORT_PRECURSOR_MZ_PPM.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.EXCLUDE_UNKNOWN_PTMs.id) + " " + IdentificationParametersCLIParams.EXCLUDE_UNKNOWN_PTMs.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.PTM_SCORE.id) + " " + IdentificationParametersCLIParams.PTM_SCORE.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.PTM_THRESHOLD.id) + " " + IdentificationParametersCLIParams.PTM_THRESHOLD.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.SCORE_NEUTRAL_LOSSES.id) + " " + IdentificationParametersCLIParams.SCORE_NEUTRAL_LOSSES.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.PTM_SEQUENCE_MATCHING_TYPE.id) + " " + IdentificationParametersCLIParams.PTM_SEQUENCE_MATCHING_TYPE.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.DB_PI.id) + " " + IdentificationParametersCLIParams.DB_PI.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.PSM_FDR.id) + " " + IdentificationParametersCLIParams.PSM_FDR.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.PEPTIDE_FDR.id) + " " + IdentificationParametersCLIParams.PEPTIDE_FDR.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.PROTEIN_FDR.id) + " " + IdentificationParametersCLIParams.PROTEIN_FDR.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.SEPARATE_PSMs.id) + " " + IdentificationParametersCLIParams.SEPARATE_PSMs.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.SEPARATE_PEPTIDES.id) + " " + IdentificationParametersCLIParams.SEPARATE_PEPTIDES.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MERGE_SUBGROUPS.id) + " " + IdentificationParametersCLIParams.MERGE_SUBGROUPS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.PROTEIN_FRACTION_MW_CONFIDENCE.id) + " " + IdentificationParametersCLIParams.PROTEIN_FRACTION_MW_CONFIDENCE.description + "\n";

        output += "\n\nHelp:\n\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.MODS.id) + " " + IdentificationParametersCLIParams.MODS.description + "\n";
        output += "-" + String.format(formatter, IdentificationParametersCLIParams.USAGE.id) + " " + IdentificationParametersCLIParams.USAGE.description + "\n";

        return output;
    }
}
